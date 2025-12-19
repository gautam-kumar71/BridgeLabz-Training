import java.util.Scanner;

//Create DigitFrequency class to find frequency of digits in a number
public class DigitFrequency {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Taking input number
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int tempNumber = number;
        int count = 0;

        //Finding count of digits
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

        //Create frequency array of size 10 (0–9)
        int[] frequency = new int[10];

        //Finding frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        //Displaying frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
