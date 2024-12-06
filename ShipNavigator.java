//william alvey
import java.util.Scanner;

public class ShipNavigator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ShipNavigator!!!");

        while (true) {
            // collect ship details
            System.out.println("\nEnter the name of the ship:");
            String name = scanner.nextLine();

            System.out.println("Enter its launch date (mm/dd/yyyy):");
            String launchDate = scanner.nextLine();

            System.out.println("Is it a cruise ship or a cargo ship?");
            String type = scanner.nextLine();

            // Branch based on ship type
            if (type.equalsIgnoreCase("cruise")) {
                System.out.println("Enter the ship's passenger capacity:");
                int passengerCapacity = Integer.parseInt(scanner.nextLine());
                

                System.out.println("How many crew members are on this ship?");
                int crew = Integer.parseInt(scanner.nextLine());

                System.out.println("Creating a cruise ship...");
                CruiseShip cruiseShip = new CruiseShip(name, launchDate, passengerCapacity, crew);
                
                System.out.println("Printing the ship's details:");
                System.out.println(cruiseShip);
                
            } 
            else if (type.equalsIgnoreCase("cargo")) {
                System.out.println("Enter the ship's tonnage (DWT):");
                int tonnage = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter the maximum speed of the ship (in mph):");
                double maxSpeed = Double.parseDouble(scanner.nextLine());

                System.out.println("Creating a cargo ship...");
                CargoShip cargoShip = new CargoShip(name, launchDate, tonnage, maxSpeed);
                System.out.println("Printing the ship's details:");
                System.out.println(cargoShip);
            } 
            else {
                System.out.println("Invalid ship type. Please enter 'cruise' or 'cargo'.");
                continue;
            }

            // ask if the user wants to create another ship
            System.out.println("Do you want to construct another ship object? Enter yes or no:");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                System.out.println("Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}
