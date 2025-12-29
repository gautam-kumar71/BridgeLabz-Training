import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int targetNumber = (int) (Math.random() * 100) + 1; // Number between 1 and 100
        int userGuess;
        int guessCount = 0;
        int maxTries = 5;

        System.out.println("Guess the number between 1 and 100");

        // do-while loop executes at least once
        do {
            System.out.print("Enter your guess: ");
            userGuess = input.nextInt();
            guessCount++;

            if (userGuess > targetNumber) {
                System.out.println("Too High!");
            } else if (userGuess < targetNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Correct Guess!");
                System.out.println("Attempts taken: " + guessCount);
                input.close();
                return;
            }

        } while (guessCount < maxTries);

        // If all attempts are used
        System.out.println("Game Over! You've used all attempts.");
        System.out.println("The correct number was: " + targetNumber);

        input.close();
    }
}
