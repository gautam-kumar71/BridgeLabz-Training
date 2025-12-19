import java.util.Scanner;

//Create YoungestAndTallest class to find youngest and tallest friend
public class YoungestAndTallest {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Array to store names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        //Arrays to store ages and heights
        int[] age = new int[3];
        double[] height = new double[3];

        //Taking input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Enter age: ");
            age[i] = sc.nextInt();

            System.out.print("Enter height: ");
            height[i] = sc.nextDouble();
        }

        //Assuming first friend is youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;

        //Finding youngest and tallest
        for (int i = 1; i < 3; i++) {

            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        //Displaying results
        System.out.println("The youngest friend is: " + names[youngestIndex]);
        System.out.println("The tallest friend is: " + names[tallestIndex]);
    }
}
