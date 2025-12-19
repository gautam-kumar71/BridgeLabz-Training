import java.util.Scanner;
//create LargestOfThree class to find the largest among three numbers
public class LargestOfThree {
	public static void main(String args[]) {
		//Taking input from the user
		Scanner input = new Scanner(System.in);
		int first = input.nextInt();
		int second = input.nextInt();
		int third = input.nextInt();
		
		//Check which is the largest among three and Print the result
		System.out.println(
			"Is the first number the largest? " + ((first>second) && (first > third)) +
			"\nIs the second number the largest? " + ((second > first) && (second > third)) +
			"\nIs the third number the largest? " + ((third > first) && (third > second)));
		input.close();
	}
}

