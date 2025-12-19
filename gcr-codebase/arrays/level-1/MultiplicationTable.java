
import java.util.Scanner;
//Create MultiplicationTable class to print multiplication table

public class MultiplicationTable {

    public static void main(String[] args) {
        //Defining multiplication_table variable to store the multiplication table
        int[] multiplication_table = new int[10];

        //Taking single input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        //Calculating the multiplication table and storing it in multiplication_table array
        int i = 0;
        while (i < 10) {
            multiplication_table[i] = (i+1) * number;
            i++;
        }

        //Displaying the table
        int j = 0;
        while (j < 10) {
            System.out.println(number + "x" + (j+1) + " = " + multiplication_table[j++]);
        }
    }
}
