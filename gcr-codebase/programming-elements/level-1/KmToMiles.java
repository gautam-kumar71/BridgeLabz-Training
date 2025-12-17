//Create KmToMiles class to convert kilometers into miles
import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Variable to store kilometers
        double km;

        // Ask user for input
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // Convert kilometers to miles
        double miles = km / 1.6;

        // Display the result
        System.out.println("The total miles is " + miles + 
                           " mile for the given " + km + " km");

        input.close();
    }
}

