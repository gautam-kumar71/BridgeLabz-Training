import java.util.Scanner;

// Create class ArrayIndexOutOfBoundsDemo to demonstrate exception
public class ArrayIndexOutOfBoundsDemo {

    // Method to generate exception (no handling)
    public static void generateException(String[] names) {
        // Accessing index larger than array length
        System.out.println(names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException and RuntimeException
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input for array size
        System.out.println("Enter number of names:");
        int size = sc.nextInt();

        String[] names = new String[size];

        // Take array input
        System.out.println("Enter names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        // First: generate exception (abrupt termination if not handled)
        try {
            generateException(names);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception generated: " + e.getMessage());
        }

        // Second: handle the exception
        handleException(names);

        sc.close();
    }
}
