import java.util.Scanner;

// Create class NumberFormatDemo to demonstrate NumberFormatException
public class NumberFormatDemo {

    // Method to generate exception (no handling)
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not numeric
        int number = Integer.parseInt(text);
        System.out.println("Number is: " + number); // will not execute if exception occurs
    }

    // Method to handle NumberFormatException and RuntimeException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number is: " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input as String
        System.out.println("Enter a string:");
        String input = sc.next();

        // generate exception 
        try {
            generateException(input);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception generated: " + e.getMessage());
        }

        //handle the exception
        handleException(input);

        sc.close();
    }
}
