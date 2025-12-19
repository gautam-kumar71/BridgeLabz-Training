// Creating divisibilityCheck class to check if a number is divisible by 5 or not
import java.util.Scanner;
public class divisibilityCheck {
	public static void main(String args[]) {

		//Taking input from user
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		//Check If number is divisble by 5 and display the result
		System.out.println("Is the number " + number +" divisible by 5? " + (number%5==0));
		input.close();
	}
}

		