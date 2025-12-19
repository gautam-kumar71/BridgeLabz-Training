import java.util.Scanner;

//Create FizzBuzzArray class to store FizzBuzz results in an array
public class FizzBuzzArray {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter a positive number:");
        int number = sc.nextInt();

        //Checking for positive integer
        if (number <= 0) {
            System.err.println("Invalid input. Please enter a positive number.");
            return;
        }

        //Create String array to store FizzBuzz results
        String[] result = new String[number + 1];

        //Loop from 0 to the given number
        for (int i = 0; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                result[i] = "FizzBuzz";
            } 
            else if (i % 3 == 0 && i != 0) {
                result[i] = "Fizz";
            } 
            else if (i % 5 == 0 && i != 0) {
                result[i] = "Buzz";
            } 
            else {
                result[i] = String.valueOf(i);
            }
        }

        //Displaying the results from the array
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }
    }
}
