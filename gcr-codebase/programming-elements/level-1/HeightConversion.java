import java.util.Scanner;

// Creating class HeightConversion indicating height calculation
class HeightConversion {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create variable heightInCm and take user input
        double heightInCm = input.nextDouble();

        // Convert cm to inches
        double heightInInches = heightInCm / 2.54;

        // Convert inches to feet and remaining inches
        int heightInFeet = (int) (heightInInches / 12);
        double remainingInches = heightInInches % 12;

        // Display the result
        System.out.println(
            "Your Height in cm is " + heightInCm +
            " while in feet is " + heightInFeet +
            " and inches is " + remainingInches
        );

        // Close scanner
        input.close();
    }
}

