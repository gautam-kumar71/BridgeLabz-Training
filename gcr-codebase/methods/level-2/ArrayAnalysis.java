import java.util.Scanner;

// Create class ArrayAnalysis
public class ArrayAnalysis {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {

            // Taking input from the user
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println("Positive Even");
                } else {
                    System.out.println("Positive Odd");
                }
            } else {
                System.out.println("Negative Number");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);

        if (result == 0) {
            System.out.println("First and last elements are equal");
        } else if (result == 1) {
            System.out.println("First element is greater than last");
        } else {
            System.out.println("First element is less than last");
        }

        input.close();
    }
}
