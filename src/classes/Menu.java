package classes;

import java.util.Scanner;

public class Menu {
    
    public static int option;
    public static Scanner scanner = new Scanner(System.in);
    public static Airplane airplane = new Airplane();

    public Menu() {
        mainMenu();
    }

    public static void mainMenu() {

        do {
            System.out.println("\nMENU");
            System.out.println("1. Request seat");
            System.out.println("2. Check seat availability");
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
        
        Passenger passenger = new Passenger(name, ssn);
                
        do {
            scanner.nextLine();
            System.out.println("Select class");
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
        
        int seatNumber;

        airplane.printSeats();
        
        switch (seatClass) {
            case 1:
                scanner.nextLine();
                System.out.println("Select location");
                System.out.println("1. Window");
                System.out.println("2. Hall");
                System.out.print("Enter an option: ");
                seatNumber = scanner.nextInt();
                break;
            case 2:
                scanner.nextLine();
                System.out.println("Select location");
                System.out.println("1. Window");
                System.out.println("2. Center");
                System.out.println("3. Hall");
                System.out.print("Enter an option: ");
                seatNumber = scanner.nextInt();
                break;
            default:
                break;
        }
    }


}
