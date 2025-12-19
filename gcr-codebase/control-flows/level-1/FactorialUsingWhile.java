import java.util.*;
//Create FactorialUsingWhile class to compute factorial of a number using while loop
public class FactorialUsingWhile {
	public static void main(String args[]) { 
		//Taking input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = input.nextInt();
		long factorial=1;
		
		//Check if its positive or not
		if(number > 0) {
			while(number!=0) //Computing Factorial Using While loop
			{
				factorial *= number--;
			}
			System.out.println("Factorial is " + factorial);
		}
		else
		{
			System.out.println("Negative Input");
		}
		input.close();
	}
}
