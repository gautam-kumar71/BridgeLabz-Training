import java.util.Scanner;

// Create class TrigonometricCalculator
class TrigonometricCalculator {

    // Method to calculate trigonometric values
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{
            Math.sin(radians),
            Math.cos(radians),
            Math.tan(radians)
        };
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        double[] values = calculateTrigonometricFunctions(angle);

        System.out.println("Sine value is " + values[0]);
        System.out.println("Cosine value is " + values[1]);
        System.out.println("Tangent value is " + values[2]);

        input.close();
    }
}
