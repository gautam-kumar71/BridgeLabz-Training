import java.util.*;
//Create FactorialUsingFor class to find the factorial of an integer entered by the user using For loop.
public class FactorialUsingFor {
	public static void main(String args[]) { 
		//Taking input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = input.nextInt();
		long factorial=1;
		
		//Check if its positive or not
		if(number > 0) {
			for(int i=number; i>0;i--) //Computing Factorial 
			{
				factorial *= i;
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
