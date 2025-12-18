import java.util.Scanner;:
//Create IntOperation class to perform operations
public class IntOperation {
    public static void main(String[] args) {
	//Create variable a,b,c to store input values
	int a,b,c;
		
        //Taking input from user
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        //Perform operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Print results
        System.out.println(
            "The results of Int Operations are " +
            result1 + ", " + result2 + ", " +
            result3 + ", and " + result4);
		input.close(); 
    }
}
