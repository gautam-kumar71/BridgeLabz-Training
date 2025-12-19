import java.util.Scanner;

//Create StoreNumbersAndSum class to store numbers in an array and calculate their sum
public class StoreNumbersAndSum {
    public static void main(String[] args) {

        //Create an array of size 10 to store double values
        double[] numbers = new double[10];

        //Create a variable total to store the sum of numbers and initialize it to 0.0
        double total = 0.0;

        //Index variable to track the position in the array
        int index = 0;

        //Creating Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (0 or negative number to stop):");

        //Using infinite while loop
        while (true) {

            //Taking user input
            double value = sc.nextDouble();

            //Checking if user entered 0 or a negative number
            if (value <= 0) {
                break;
            }

            //Checking if array size limit is reached
            if (index == 10) {
                break;
            }

            //Storing the value in the array and incrementing index
            numbers[index++] = value;
        }

        //Using for loop to display values and calculate total
        System.out.println("The entered numbers are:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        //Displaying the total sum of numbers
        System.out.println("The total sum of the numbers is: " + total);
    }
}
