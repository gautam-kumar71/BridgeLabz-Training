import java.util.Scanner;

// Create class SumOfNaturalNumbers to calculate sum
class SumOfNaturalNumbers {

    // Method to calculate sum using loop
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter value of n: ");
        int n = input.nextInt();

        int result = findSum(n);

        System.out.println("Sum of first " + n + " natural numbers is " + result);

        input.close();
    }
}
