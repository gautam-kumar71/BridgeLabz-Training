import java.util.Scanner;

//Create LargestDigits class to find largest and second largest digit
public class LargestDigits {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Taking input number
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        //Define maximum digits
        int maxDigit = 10;

        //Create array to store digits
        int[] digits = new int[maxDigit];

        //Index variable for array
        int index = 0;

        //Extracting digits from number
        while (number != 0 && index < maxDigit) {

            //Getting last digit
            digits[index++] = number % 10;

            //Removing last digit
            number = number / 10;
        }

        //Variables to store largest and second largest digit
        int largest = 0;
        int secondLargest = 0;

        //Finding largest and second largest digit
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        //Displaying the result
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
    }
}
