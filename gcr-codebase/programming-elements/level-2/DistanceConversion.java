import java.util.Scanner;
//Create DistanceConversion to convert the distance
public class DistanceConversion {
	public static void main(String args[]) {
		//Create variable distanceInFeet to store distance in feets
		double distanceInFeet;
		
		//Taking input from user
		Scanner input = new Scanner(System.in);
		distanceInFeet = input.nextDouble();
		
		//Calculating the distance in yards and miles and printing it
		double distanceInYard = distanceInFeet/3;
		double distanceInMiles = distanceInYard/1760;
		System.out.println(
			"The distance in yards is " + distanceInYard + 
			" while the distance in miles is " + distanceInMiles);
		input.close();
	}
}
