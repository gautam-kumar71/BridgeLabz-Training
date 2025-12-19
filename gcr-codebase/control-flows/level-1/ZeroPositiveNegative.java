import java.util.Scanner;
//Create ZeroPositiveNegative class to check if a number is zero, positive or negative
public class ZeroPositiveNegative {
	public static void main(String args[]) {
		//Taking input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = input.nextInt();
		
		//Checks if a Number is positive, negative, or zero and Display the result
		if(number > 0) 
			System.out.println("Positive");
		else if(number < 0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
		input.close();
	}
}