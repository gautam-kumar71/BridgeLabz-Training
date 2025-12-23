import java.util.Scanner;

public class MaximumOfThree {

    // Method to find maximum of three numbers
    static int findMaximum(int a, int b, int c) {
        int max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Display result
        System.out.println("Maximum number is: " +
                findMaximum(a, b, c));
    }
}
