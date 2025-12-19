import java.util.Scanner;
//Create CheckFirstNumberSmallest class to check if the first number is smallest among three numbers
public class CheckFirstNumberSmallest {
	public static void main(String args[]) { 
		//Taking input from user
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		//Check if the first is the smallest among the 3 numbers
		System.out.println("Is the first number the smallest? " + ((number1 < number2) && (number3 > number1)));
		input.close();
	}
}
