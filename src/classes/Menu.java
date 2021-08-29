package classes;

import java.util.Scanner;

public class Menu {
    
    public static int option;
    public static Scanner scanner = new Scanner(System.in);
    public static Airplane airplane = new Airplane();
    public static Passenger passenger;

    public Menu() {
        mainMenu();
    }

    public static void mainMenu() {

        do {
            System.out.println("\nMENU");
            System.out.println("1. Request seat");
            System.out.println("2. Check seats availability");
            System.out.println("3. Get out");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    requestSeatMenu();
                    break;
                case 2:
                    airplane.printSeats();
                    break;
                default:
                    System.out.println("See you!\n");
                    return;
            }
        } while (option>= 1 && option <= 2);

    }

    public static void requestSeatMenu() {
        String name;
        String ssn;
        int seatClass;
        
        scanner.nextLine();
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter SSN: ");
        ssn = scanner.nextLine();
        
        passenger = new Passenger(name, ssn);
                
        do {
            // scanner.nextLine();
            System.out.println("\nSelect class");
            System.out.println("1. Executive");
            System.out.println("2. Economic");
            System.out.print("Enter an option: ");
            seatClass = scanner.nextInt();

            if (seatClass> 1 && seatClass < 2) {
                System.out.println("Invalid option");
            }

        } while (seatClass> 1 && seatClass < 2);
        
        selectLocationMenu(seatClass);
        
    }
    
    public static void selectLocationMenu(int seatClass) {

        int locationNumber;
        String locationName;

        System.out.println();
        airplane.printSeats();
        
        switch (seatClass) {
            case 1:
                scanner.nextLine();
                System.out.println("\nSelect location");
                System.out.println("1. Window");
                System.out.println("2. Hall");
                System.out.print("Enter an option: ");
                locationNumber = scanner.nextInt();
                    
                if (locationNumber == 1) {
                    locationName = "Window";
                } else {
                    locationName = "Hall";
                }

                assignSeat(seatClass, locationName);
                break;
            case 2:
                scanner.nextLine();
                System.out.println("Select location");
                System.out.println("1. Window");
                System.out.println("2. Center");
                System.out.println("3. Hall");
                System.out.print("Enter an option: ");
                locationNumber = scanner.nextInt();
            
                switch (locationNumber) {
                    case 1:
                        locationName = "Window";
                        break;
                    case 2:
                        locationName = "Center";
                        break;
                    case 3:
                        locationName = "Hall";
                        break;
                    default:
                        locationName = "Center";
                        break;
                }
                assignSeat(seatClass, locationName);
                break;
            default:
                break;
        }
    }

    public static void assignSeat(int seatClass, String locationName) {
        
        boolean found = false;
        int seatNumber;
        
        if (seatClass == 1) {
            for (int i = 0; i < ExecutiveSeat.rows; i++) {
                for (int j = 0; j < ExecutiveSeat.cols; j++) {
                    if (
                        airplane.executiveSeats[i][j].getPassenger() == null &&
                        airplane.executiveSeats[i][j].getLocation() == locationName
                    ) {    
                        seatNumber = airplane.executiveSeats[i][j].getNumber();
                        airplane.executiveSeats[i][j] = new ExecutiveSeat(
                                                                            passenger,
                                                                            locationName,
                                                                            seatNumber
                                                                            );
                        found = true;
                        System.out.println("\nSeat request has been successfull!");
                        System.out.println("Your seat number is #" + seatNumber);                                                 
                        return;
                    }
                }
            }

            if (!found) {
                System.out.println("\nSorry, there are not available seats for your request :(");
                System.out.println("Check the availability and look for another seat");
            }

        } else {
            
            for (int i = 0; i < EconomicSeat.rows; i++) {
                for (int j = 0; j < EconomicSeat.cols; j++) {
                    if (
                        airplane.economicSeats[i][j].getPassenger() == null &&
                        airplane.economicSeats[i][j].getLocation() == locationName
                    ) {    
                        seatNumber = airplane.economicSeats[i][j].getNumber();
                        airplane.economicSeats[i][j] = new EconomicSeat(
                                                                            passenger,
                                                                            locationName,
                                                                            seatNumber
                                                                            );
                        found = true;
                        System.out.println("\nSeat request has been successfull!");
                        System.out.println("Your seat number is #" + seatNumber);                                                 
                        return;
                    }
                }
            }

            if (!found) {
                System.out.println("\nSorry, there are not available seats for your request :(");
                System.out.println("Check the availability and look for another seat");
            }

        }

    }

}
