import java.util.Scanner;
//Create DoubleOpt class to perform operations
public class DoubleOpt {
    public static void main(String[] args) {
	//Create variable a,b,c to store input values
	double a,b,c;
        
	//Taking input from user
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        //Perform operations 
        double result1 = a + b * c;   
        double result2 = a * b + c; 
        double result3 = c + a / b;  
        double result4 = a % b + c;  

        //Display the result
        System.out.println(
            "The results of Double Operations are " +
            result1 + ", " + result2 + ", " +
            result3 + ", and " + result4);
		input.close();
    }
}
