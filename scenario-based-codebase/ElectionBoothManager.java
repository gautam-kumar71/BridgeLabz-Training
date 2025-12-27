import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Variables to store vote count for each candidate
        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;

        // Loop to allow multiple voters to vote
        while (true) {

            // Take age input from voter
            System.out.print("Enter age (-1 to exit): ");
            int age = sc.nextInt();

            // Special condition to exit the voting process
            if (age == -1) {
                break;
            }

            // Check voter eligibility using if condition
            if (age >= 18) {

                // Eligible voter can cast vote
                System.out.print("Enter your vote (1 / 2 / 3): ");
                int vote = sc.nextInt();

                // Record vote based on candidate number
                if (vote == 1) {
                    candidate1++;
                } else if (vote == 2) {
                    candidate2++;
                } else if (vote == 3) {
                    candidate3++;
                } else {
                    // Handle invalid vote input
                    System.out.println("Invalid vote entered");
                }

            } else {
                // If voter age is less than 18
                System.out.println("You are not eligible to vote");
            }
        }

        // Display final voting results
        System.out.println("\nElection Results:");
        System.out.println("Candidate 1 Votes: " + candidate1);
        System.out.println("Candidate 2 Votes: " + candidate2);
        System.out.println("Candidate 3 Votes: " + candidate3);

        // Close the Scanner resource
        sc.close();
    }
}
