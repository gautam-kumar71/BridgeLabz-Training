import java.util.Scanner;

//Create MeanHeight class to calculate mean height of football players
public class MeanHeight {
    public static void main(String[] args) {

        //Create an array of size 11 to store heights
        double[] heights = new double[11];

        //Variable to store sum of heights
        double sum = 0.0;

        //Create Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter heights of 11 football players:");

        //Taking input values from user
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        //Calculating mean height
        double mean = sum / 11;

        //Displaying mean height
        System.out.println("The mean height of the football team is: " + mean);
    }
}
