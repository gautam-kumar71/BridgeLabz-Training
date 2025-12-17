// Create HandshakeCalculator class to calculate maximum handshakes
import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number of students input
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate maximum handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of possible handshakes is " + handshakes);

        input.close();
    }
}

