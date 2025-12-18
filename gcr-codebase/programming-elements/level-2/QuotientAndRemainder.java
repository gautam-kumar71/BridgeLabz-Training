import java.util.Scanner;
//Create QuotientAndRemainder to calculate the quotient and remainder of numbers
public class QuotientAndRemainder {
    public static void main(String[] args) {
	//Create number1 and number2 to store number1 and number 2
	int number1, number2;
		
        //Taking input from user
        Scanner input = new Scanner(System.in);
	number1 = input.nextInt();
        number2 = input.nextInt();

        //Display the result
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println(
            "The Quotient is " + quotient +
            " and Reminder is " + remainder +
            " of two number " + number1 +
            " and " + number2);
		input.close();
    }
}
