import java.util.Scanner;
//Create SumUsingWhileBreak class to find the sum until the user enters 0 or a negative number
public class SumUsingWhileBreak {
	public static void main(String args[]) {
		//Taking input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		double value = input.nextDouble();
		double total = 0.0;
		
		//Sum until users input 0 or negative value
		if(value > 0) {
			while(true)
			{
				total += value;
				System.out.println("Input value again");
				value = input.nextDouble();
				if(value<=0)
					break;
			}
			System.out.println("Total Value " + total);
		}
		else
		{
			System.out.println("Total Value " + total);
		}
		input.close();
	}
}