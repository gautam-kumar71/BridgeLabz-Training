
import java.util.Scanner;
//Create NumberCheck class to check numbers

public class NumberCheck {

    public static void main(String[] args) {
        //Defining numbers to hold the five numbers
        int[] numbers = new int[5];

        //Taking 5 inputs from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the five numbers");
        int i = 0;
        while (i < 5) {
            numbers[i++] = sc.nextInt();
        }

        //Checking numbers 
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] < 0) {
                System.out.println("Negative");
            } else if (numbers[j] == 0) {
                System.out.println("Zero");
            } else {
                if (numbers[j] % 2 == 0) {
                    System.out.println("Positive Even");
                } else {
                    System.out.println("Positive Odd");
                }
            }
        }
        //Comparing the first and the last number of the array
        if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("The first number is smaller than the last");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first number is greater than the last");
        } else {
            System.out.println("The first number is equal to the last");
        }

    }
}
