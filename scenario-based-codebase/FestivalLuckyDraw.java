import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of visitors participating
        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        // Loop for each visitor
        for (int i = 1; i <= visitors; i++) {

            System.out.print("Visitor " + i + ", enter your lucky number: ");
            int number = sc.nextInt();

            
            if (number <= 0) {
                System.out.println("Invalid number! Please enter a positive number.");
                continue; // Skip current visitor
            }

            // Check if number is divisible by both 3 and 5
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift!");
            } else {
                System.out.println("Sorry! Better luck next time.");
            }
        }
    }
}
