import java.util.Scanner;

//Create class IllegalArgumentDemo to demonstrate IllegalArgumentDemo Exception
public class IllegalArgumentDemo {

    // Method to generate exception (no handling)
    public static void generateException(String input) {
        
        String result = input.substring(5, 2);
        System.out.println(result); 
    }

    // Method to handle IllegalArgumentException and RuntimeException
    public static void handleException(String input) {
        try {
            
            String result = input.substring(5, 2);
            System.out.println(result);
        }
        catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String input = sc.next();

        try
        {
         generateException(input);
         }
        catch(Exception e)
        {
            handleException(input);
        }

        //handling the raised exception
        handleException(input);
        sc.close();
    }
}
