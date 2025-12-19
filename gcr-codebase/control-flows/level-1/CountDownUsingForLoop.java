import java.util.Scanner;
//Create CountDownUsingForLoop class to perform a countdown from a given number to 1 using for loop
public class CountDownUsingForLoop {
	public static void main(String args[]) {
		//Taking input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Counter : ");
		int counter = input.nextInt();
		
		//Performing countdown using for loop
		for(int i=counter; i>0;i--){
			System.out.println(i);
		}
		input.close();
	}
}