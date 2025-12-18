import java.util.Scanner;
//Create SquareSideLength to calculate the perimeter of square
public class SquareSideLength {
	public static void main(String args[]) {
		//Create variable perimeter to store the perimeter of square
		double perimeter;
		
		//Taking input from user
		Scanner input = new Scanner(System.in);
		perimeter = input.nextDouble();
		
		//Calculating the length of side of square
		double side = perimeter/4.0;
		
		//Display the result
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
		input.close();
	}
}

