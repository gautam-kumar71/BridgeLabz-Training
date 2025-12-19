import java.util.Scanner;

//Create ReverseNumberUsingArray class to reverse a number using arrays
public class ReverseNumberUsingArray {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Taking input number
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int tempNumber = number;
        int count = 0;

        //Finding number of digits
        while (tempNumber != 0) {
            count++;
            tempNumber = tempNumber / 10;
        }

        //Create array to store digits
        int[] digits = new int[count];

        //Reset tempNumber
        tempNumber = number;

        //Storing digits in array
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }

        //Create array to store reversed digits
        int[] reverseDigits = new int[count];

        //Copy digits into reverse array
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[i];
        }

        //Displaying reversed number
        System.out.print("Reversed number is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i]);
        }
    }
}
