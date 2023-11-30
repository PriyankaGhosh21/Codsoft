import java.util.Random;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int attemptsLimit = 10;
        int rounds = 0;
        int totalAttempts = 0;

        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess the number between " + lowerBound + " and " + upperBound + ".");

            boolean correctGuess = false;

            while (!correctGuess && attempts < attemptsLimit) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    correctGuess = true;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            totalAttempts += attempts;
            rounds++;

            System.out.println("The correct number was: " + targetNumber);
            System.out.println("Round Summary - Attempts: " + attempts + ", Total Attempts: " + totalAttempts);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();

            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing! Your final score - Rounds: " + rounds + ", Total Attempts: " + totalAttempts);

        scanner.close();
    }
}
