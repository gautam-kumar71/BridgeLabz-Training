import java.util.Scanner;
//Create AreaOfTriangle to calculate the area of triangle
public class AreaOfTriangle {
	public static void main(String args[]) {
		//Create variable base and height to store base and height of triangle
		double base, height;
		
		//Taking input from user
		Scanner input = new Scanner(System.in);
		base = input.nextDouble();
		height = input.nextDouble();
		
		//Calculating area of triangle in square centimetres and square inches
		double areaInSquareCentimetres = 1.0/2.0*base*height;
		double areaInSquareInches = areaInSquareCentimetres/6.452;
		
		//Printing the results
		System.out.println("The Area of the triangle in sq in is " + areaInSquareInches + " and sq cm is " + areaInSquareCentimetres);
		input.close();
	}
}
