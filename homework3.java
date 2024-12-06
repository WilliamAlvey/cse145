//William Alvey
import java.util.Random;
import java.util.Scanner;

public class homework3 {

    
    public static void main(String[] args) {
    
        
    	Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        // Loop to allow the user to replay the game
        while (playAgain) {
            playGame(scanner);  // Call the method to play a single game
            System.out.println("Do you want to play again? (yes/no)");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    // Method to play a single game of best 2 out of 3
    public static void playGame(Scanner scanner) {
        int userScore = 0;
        int computerScore = 0;

        for (int round = 1; round <= 3; round++) {
            System.out.println("Round " + round + ": Enter rock, paper, or scissors.");
            String userChoice = scanner.next().toLowerCase();
            String computerChoice = getComputerChoice();

            System.out.println("Computer chose: " + computerChoice);

            // Determine the result of the round
            int result = determineWinner(userChoice, computerChoice);
            
            if (result == 1)
            {
                userScore++;
                System.out.println("You win this round!");
            } 
            
            else if (result == -1) {
                computerScore++;
                System.out.println("Computer wins this round!");
            } 
            
            else if (result == 0) {
                System.out.println("It's a draw!");
            } 
            
            else {
                computerScore++;
                System.out.println("Invalid choice! Computer gets the point.");
            }
        }

        // Declare the overall winner
        declareWinner(userScore, computerScore);
    }

    // Method to randomly select computer's choice
    public static String getComputerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3); 

        // Convert the random number to rock, paper, or scissors
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "";
        }
    }

    // Method to determine the winner of a round
    public static int determineWinner(String userChoice, String computerChoice) {
        // Check for a draw
        if (userChoice.equals(computerChoice)) {
            return 0;  // It's a draw
        }

        // User wins conditions
        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            return 1;  // User wins
        }

        // If user input is invalid
        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            return -2;  // Invalid input
        }

        return -1;  // Computer wins
    }

    // Method to declare the overall winner after 3 rounds
    public static void declareWinner(int userScore, int computerScore) {
        System.out.println("\nFinal Scores:");
        System.out.println("You: " + userScore + " | Computer: " + computerScore);

        if (userScore > computerScore) {
            System.out.println("Congratulations! You won the game!");
        } else if (computerScore > userScore) {
            System.out.println("Sorry, the computer won the game.");
        } else {
            System.out.println("It's a tie!");
        }
    }
}

