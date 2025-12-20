// Create maximumNumberHandshakes class to calculate maximum handshakes
import java.util.Scanner;

public class maximumNumberHandshakes {

    public static int handshakesCalculator(int numberOfStudents)
	{
	   // Calculate maximum handshakes
	   int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
       return handshakes;
	}

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number of students input
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Display the result
        System.out.println("The maximum number of possible handshakes is " + handshakesCalculator(numberOfStudents));

        input.close();
    }
}

