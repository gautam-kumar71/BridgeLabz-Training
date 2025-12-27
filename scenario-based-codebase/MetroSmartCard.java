import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Initialize smart card balance
        double balance = 100;

        // Loop runs until balance is exhausted or user exits
        while (balance > 0) {

            // Display current balance
            System.out.println("Current Balance: ₹" + balance);

            // Take distance input from user
            System.out.print("Enter distance in km (-1 to exit): ");
            int distance = sc.nextInt();

            // Exit condition if user wants to quit
            if (distance == -1) {
                break;
            }

            // Calculate fare using ternary operator
            // If distance is 5 km or less → fare is 10
            // Else → fare is 20
            int fare = (distance <= 5) ? 10 : 20;

            // Check if sufficient balance is available
            if (balance >= fare) {

                // Deduct fare from balance
                balance = balance - fare;
                System.out.println("Fare Deducted: ₹" + fare);

            } else {
                // If balance is insufficient
                System.out.println("Insufficient balance");
                break;
            }
        }

        // Display final balance
        System.out.println("Journey ended. Remaining Balance: ₹" + balance);

        // Close Scanner
        sc.close();
    }
}
