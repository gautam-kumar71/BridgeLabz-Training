import java.util.Scanner;

//Create BMIOfPersons class to calculate BMI and weight status of persons
public class BMIOfPersons {
    public static void main(String[] args) {

        //Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        //Taking input for number of persons
        System.out.println("Enter number of persons:");
        int persons = sc.nextInt();

        //Create arrays to store height, weight, BMI, and weight status
        double[] height = new double[persons];
        double[] weight = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];

        //Taking input for height and weight of each person
        for (int i = 0; i < persons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Enter height in meters: ");
            height[i] = sc.nextDouble();

            System.out.print("Enter weight in kg: ");
            weight[i] = sc.nextDouble();
        }

        //Calculating BMI and determining weight status
        for (int i = 0; i < persons; i++) {

            //BMI Formula: weight / (height * height)
            bmi[i] = weight[i] / (height[i] * height[i]);

            //Determining weight status based on BMI table
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } 
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } 
            else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } 
            else {
                status[i] = "Obese";
            }
        }

        //Displaying height, weight, BMI, and weight status of each person
        System.out.println("\nBMI Report:");
        for (int i = 0; i < persons; i++) {
            System.out.println(
                "Person " + (i + 1) +
                " | Height: " + height[i] +
                " | Weight: " + weight[i] +
                " | BMI: " + bmi[i] +
                " | Status: " + status[i]
            );
        }
    }
}
