import java.util.*;
//create SumOfNaturalNumbersUsingFor class to find the sum of n natural numbers
public class SumOfNaturalNumbersUsingFor {
	public static void main(String args[]) { 
		//Taking input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = input.nextInt();
		int sumUsingFor = 0, sumUsingFormulae = 0;
		
		//Check if the number is natural no. or not
		if(number > 0)
		{
			sumUsingFormulae = number * (number + 1)/2;
			for(int i=number; i>0;i--)
			{
				sumUsingFor += i;
			}
			if(sumUsingFor == sumUsingFormulae) //Check if both have exact result
				System.out.println("The result from both computations was same and the sum is " +sumUsingFormulae);
			else
				System.out.println("The result from both computations was not same ");		
		}
		else
		{
			System.out.println("Not a Natural Number");
		}
		input.close();
	}
}