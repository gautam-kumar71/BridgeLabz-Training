import java.util.Scanner;
//Create Calculator class to calculate the addition,subtraction,multiplication and divison of 2 numbers
public class Calculator {
	public static void main(String args[]) {
		//Create variable number1 and number2 to do calculation
		double number1, number2;
		
		// Taking input from user
		Scanner input = new Scanner(System.in);
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		
		//Creating variable addition, subtraction, multiplication and division to perform all operations
		double addition = number1 + number2;
		double subtraction = number1 - number2;
		double multiplication = number1 * number2;
		double division = number1 / number2;
		
		//Display the Result
		System.out.println(
			"The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + 
			" and " + number2 + 
			" is " + addition + " , " + subtraction + ", " + multiplication + ", and " + division);
		input.close();
	}
}
