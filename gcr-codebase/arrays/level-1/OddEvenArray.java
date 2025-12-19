import java.util.Scanner;

//Create OddEvenArray class to store odd and even numbers separately
public class OddEvenArray {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter a natural number:");
        int number = sc.nextInt();

        //Checking for natural number
        if (number <= 0) {
            System.err.println("Invalid input. Please enter a natural number.");
            return;
        }

        //Creating arrays for odd and even numbers
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        //Index variables for even and odd arrays
        int evenIndex = 0;
        int oddIndex = 0;

        //Looping from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        //Printing odd numbers
        System.out.println("Odd numbers are:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        //Printing even numbers
        System.out.println("\nEven numbers are:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
    }
}
