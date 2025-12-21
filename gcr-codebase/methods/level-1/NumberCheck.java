import java.util.Scanner;

// Create class NumberCheck to identify positive, negative or zero
class NumberCheck {

    // Method to check number type
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int result = checkNumber(number);
 
        //Display the result
        System.out.println("Result is " + result);

        input.close();
    }
}
