import java.util.Scanner;
//Create VoterEligibilityVerifier class to verify voter eligibility based on age
public class VoterEligibilityVerifier {
	public static void main(String args[]) {
		//Taking input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = input.nextInt();
		
		//Checks if a voter is eligible to vote or not and display the result.
		if(age >= 18) {
			System.out.println("The person's age is "+ age + " and can vote.");
		}
		else {
			System.out.println("The person's age is "+ age + " and cannot vote.");
		}
		input.close();
	}
}

