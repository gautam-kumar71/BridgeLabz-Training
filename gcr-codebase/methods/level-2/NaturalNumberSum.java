import java.util.Scanner;

// Create class NaturalNumberSum
public class NaturalNumberSum {

    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
        } else {
            int sum1 = recursiveSum(n);
            int sum2 = formulaSum(n);

            System.out.println("Sum using recursion: " + sum1);
            System.out.println("Sum using formula: " + sum2);
        }

        input.close();
    }
}
