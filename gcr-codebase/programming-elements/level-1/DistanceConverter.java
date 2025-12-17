// Create DistanceConverter class to convert feet into yards and miles
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards
        double yards = distanceInFeet / 3;

        // Convert yards to miles
        double miles = yards / 1760;

        // Display the result
        System.out.println("Distance in yards is " + yards +
                           " and in miles is " + miles);

        input.close();
    }
}

