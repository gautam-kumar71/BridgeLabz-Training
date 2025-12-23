// Write a program to demonstrate NullPointerException. 
// Hint => 
// Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String Method to generate the exception
// Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try catch block for handling the Exception while accessing one of the String method
// From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException

// Program to demonstrate NullPointerException
public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String value = null;          // initializing variable to null
        System.out.println(value.length()); // calling String method -> Exception
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Reason: Attempted to access a method on a null object.");
        }
    }

    public static void main(String[] args) {

        // Calling method that generates exception
        System.out.println("Generating Exception:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException()");
        }

        // Refactored code to handle the exception
        System.out.println("\nHandling Exception:");
        handleException();
    }
}
