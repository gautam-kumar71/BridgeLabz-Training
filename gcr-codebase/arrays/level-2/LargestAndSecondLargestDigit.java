import java.util.Scanner;

//Create LargestAndSecondLargestDigit class to find largest and second largest digit
public class LargestAndSecondLargestDigit {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Taking input number
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        //Initialize maximum digits
        int maxDigit = 10;

        //Create digits array
        int[] digits = new int[maxDigit];

        //Index variable to track array position
        int index = 0;

        //Extracting digits from number
        while (number != 0) {

            //If array size is full, increase size by 10
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;

                //Create temporary array with increased size
                int[] temp = new int[maxDigit];

                //Copy existing elements into temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                //Assign temp array to digits
                digits = temp;
            }

            //Store last digit
            digits[index++] = number % 10;

            //Remove last digit
            number = number / 10;
        }

        //Variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        //Finding largest and second largest digits
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        //Displaying the result
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
    }
}
