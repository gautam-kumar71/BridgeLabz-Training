// Create TriangleArea class to calculate area of triangle
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take base and height input
        System.out.print("Enter base in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        // Calculate area in square inches
        double areaInches = 0.5 * base * height;

        // Convert square inches to square centimeters
        double areaCm = areaInches * 6.4516;

        // Display the result
        System.out.println("Area of triangle is " + areaInches +
                           " square inches and " + areaCm +
                           " square centimeters");

        input.close();
    }
}

