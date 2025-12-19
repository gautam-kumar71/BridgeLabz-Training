import java.util.Scanner;
//Create RocketLaunch class to perform a countdown from a given number to 1
public class RocketLaunch {
	public static void main(String args[]) {
		//Taking input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Counter : ");
		int counter = input.nextInt();
		
		//Performing countdown
		while(counter>0) {
			System.out.println(counter--);
		}
		input.close();
	}
}