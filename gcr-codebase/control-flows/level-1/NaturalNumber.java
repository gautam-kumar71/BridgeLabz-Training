import java.util.Scanner;
//Create NaturalNumber class to check for natural number and sum of n natural numbers
public class NaturalNumber {
	public static void main(String args[]) {
		//Taking input from the user
		Scanner input = new Scanner(System.in);		
		System.out.Println("Enter a Number : ");
		int number = input.nextInt();
		
		//Check if the nunmber is a Natural number or not
		if(number > 0) {
			int sum = number*(number + 1)/2;
			System.out.println("The sum of " + number + " natural numbers is " +sum);
		}
		else {
			System.out.println("The sum of " + number + " is not a natural number");
		}
		input.close();
	}
}
