//William Alvey

import java.util.Scanner;

public class CoffeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Hour!");

        // Create and initialize the first Coffee object
        Coffee coffee1 = new Coffee();
        System.out.print("Enter the name of the first coffee: ");
        coffee1.setName(scanner.nextLine());
        System.out.print("Enter the caffeine content (in mg) of the first coffee: ");
        coffee1.setCaffeineContent(scanner.nextDouble());
        scanner.nextLine(); 

        // Create and initialize the second Coffee object
        Coffee coffee2 = new Coffee();
        System.out.print("Enter the name of the second coffee: ");
        
        coffee2.setName(scanner.nextLine());
        System.out.print("Enter the caffeine content (in mg) of the second coffee: ");
        
        coffee2.setCaffeineContent(scanner.nextDouble());

        // Display coffee details
        System.out.println("\n--- Coffee Details ---");
        System.out.println(coffee1);
        System.out.println(coffee2);

        // Check if the two coffees are the same
        if (coffee1.equals(coffee2)) {
            System.out.println("The two coffees are the same.");
        } else {
            System.out.println("The two coffees are different.");
        }

        // Display the risky amount for each coffee
        System.out.println("\nRisky amount for " + coffee1.getName() + ": " + coffee1.calculateRiskyAmount() + " cups.");
        System.out.println("Risky amount for " + coffee2.getName() + ": " + coffee2.calculateRiskyAmount() + " cups.");

        scanner.close();
    }
}
