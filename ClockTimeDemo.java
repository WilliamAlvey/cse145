//William Alvey

import java.util.Scanner;

public class ClockTimeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            try {
                //  prompt the user to enter hours, minutes, and seconds separately
            	System.out.println("Convert military time into 12-hour clock time!!!");
                System.out.println("Enter the hours on the military clock:");
                int hours = scanner.nextInt();
                System.out.println("Enter the minutes on the military clock:");
                int minutes = scanner.nextInt();
                System.out.println("Enter the seconds on the military clock:");
                int seconds = scanner.nextInt();

                // Creates TimeConverter object and attempt to convert to 12-hour format
                TimeConverter timeConverter = new TimeConverter(hours, minutes, seconds);
                timeConverter.updateTime(hours, minutes, seconds);
                timeConverter.displayTime();

            } catch (TimeException e) {
               
                System.out.println(e.getMessage());
            } catch (Exception e) {
              
                System.out.println("Invalid input format.");
                scanner.nextLine(); 
            }

            // Prompts the user for time in "hours:minutes:seconds" format
            System.out.println("Enter 24-hour clock time in the format 'hours:minutes:seconds':");
            scanner.nextLine();
            String timeInput = scanner.nextLine();

            try {
                // Create a second TimeConverter object and convert using the string format
                TimeConverter timeConverter2 = new TimeConverter();
                timeConverter2.updateTime(timeInput);
                timeConverter2.displayTime();
            } catch (TimeException e) {
               
                System.out.println(e.getMessage());
            } catch (Exception e) {
                // Handles non-numeric characters or incorrect format in timeInput
                System.out.println("Invalid input format for time. Please use the format 'hours:minutes:seconds'.");
            }

            // Ask if the user wants to try again
            System.out.println("Would you like to do this again? Enter 'Yes' or 'No':");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                continueProgram = false;
                System.out.println("Exiting the program!");
            }
        }
        scanner.close();
    }
}
