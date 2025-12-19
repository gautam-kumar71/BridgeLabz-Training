import java.util.Scanner;

//Create MultiplicationTable6to9 class to display multiplication table from 6 to 9
public class MultiplicationTable6to9 {
    public static void main(String[] args) {

        //Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        //Take integer input from user
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        //Create an integer array to store multiplication results (for 6 to 9)
        int[] multiplicationResult = new int[4];

        //Using for loop to calculate multiplication table from 6 to 9
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index++] = number * i;
        }

        //Displaying the multiplication table
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index++]);
        }
    }
}
