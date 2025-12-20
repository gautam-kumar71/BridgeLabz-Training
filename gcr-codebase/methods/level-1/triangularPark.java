// Create triangularPark class to calculate number of rounds
import java.util.Scanner;

public class triangularPark {
    // Calculate number of rounds

    public static double numberOfRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5.0;
        return distance / perimeter;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number of students input
        System.out.println("Enter three sides of triangle respectively: ");
        double side1 = input.nextInt();
        double side2 = input.nextInt();
        double side3 = input.nextInt();
        
        //Display the result
        System.out.printf("The number of rounds : %.2f ",numberOfRounds(side1, side2, side3));

        input.close();
    }
}
