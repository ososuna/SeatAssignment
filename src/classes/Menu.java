package classes;

import java.util.Scanner;

public class Menu {
    
    public static int option;
    public static Scanner scanner = new Scanner(System.in);

    public Menu() {
        startMenu();
    }

    public static void startMenu() {
        
        do {
            System.out.println("\nMENU");
            System.out.println("1. Request seat");
            System.out.println("2. Check seat availability");
            System.out.println("3. Get out");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Request seat");
                    break;
                case 2:
                    System.out.println("Check seat availability");
                    break;
                case 3:
                    System.out.println("See you!\n");
                    return;                
                default:
                    break;
            }
        } while (option>= 1 && option <= 3);

    }


}
