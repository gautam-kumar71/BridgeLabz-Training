import java.util.Scanner;

//Create Copy2DArrayTo1D class to copy elements of 2D array into 1D array
public class Copy2DArrayTo1D {
    public static void main(String[] args) {

        //Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        //Taking input for number of rows and columns
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        int columns = sc.nextInt();

        //Create 2D array (Matrix)
        int[][] matrix = new int[rows][columns];

        //Taking input values for the 2D array
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {            //Outer loop for rows
            for (int j = 0; j < columns; j++) {     //Inner loop for columns
                matrix[i][j] = sc.nextInt();
            }
        }

        //Create 1D array of size rows * columns
        int[] array = new int[rows * columns];

        //Index variable for 1D array
        int index = 0;

        //Copying elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {            //Outer loop for rows
            for (int j = 0; j < columns; j++) {     //Inner loop for columns
                array[index++] = matrix[i][j];
            }
        }

        //Displaying elements of the 1D array
        System.out.println("Elements of the 1D array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
