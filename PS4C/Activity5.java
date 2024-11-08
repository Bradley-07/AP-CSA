import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName;
        
        // Welcome message and user input
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();
        
        // Start the game loop
        boolean playing = true;
        while (playing) {
            System.out.println("You are standing in front of a dark cave. Do you want to enter? (yes/no)");
            String choice = scanner.nextLine().toLowerCase(); // Standardize input

            playing = processChoice(choice); // Call method to handle the decision
        }

        System.out.println("Game Over!");
        scanner.close();
    }

    public static boolean processChoice(String choice) {
        if (choice.equals("yes")) {
            System.out.println("You entered the cave and found a hidden treasure. You win!");
            return false;  // End the game
        } else if (choice.equals("no")) {
            System.out.println("You decided to stay outside. Nothing happens, but the adventure ends.");
            return false;  // End the game
        } else {
            System.out.println("Invalid input. Please choose 'yes' or 'no'.");
            return true;  // Continue the game loop
        }
    }
}
