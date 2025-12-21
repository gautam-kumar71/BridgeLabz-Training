import java.util.Scanner;

// Create class FactorOperations to work with factors of a number
public class FactorOperations {

    // Method to find factors and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int value : factors) {
            sum += value;
        }
        return sum;
    }

    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int value : factors) {
            sum += Math.pow(value, 2);
        }
        return sum;
    }

    public static long findProduct(int[] factors) {
        long product = 1;
        for (int value : factors) {
            product *= value;
        }
        return product;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Factors are:");
        for (int value : factors) {
            System.out.print(value + " ");
        }

        System.out.println("\nSum of factors: " + findSum(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));
        System.out.println("Product of factors: " + findProduct(factors));

        input.close();
    }
}
