import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Method to generate a random guess between low and high
    static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    // Method to take feedback from user
    static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high / low / correct): ");
        return sc.next().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 1, high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100.");

        while (!guessedCorrectly) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);

            String feedback = getFeedback(sc);

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                System.out.println("Computer guessed correctly!");
                guessedCorrectly = true;
            }
        }
    }
}
