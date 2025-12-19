import java.util.Scanner;

//Create BMIUsing2DArray class to calculate BMI using multi-dimensional array
public class BMIUsing2DArray {
    public static void main(String[] args) {

        //Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        //Taking input for number of persons
        System.out.println("Enter number of persons:");
        int number = sc.nextInt();

        //Create 2D array to store height, weight and BMI
        //Index 0 -> Height, Index 1 -> Weight, Index 2 -> BMI
        double[][] personData = new double[number][3];

        //Create array to store weight status
        String[] weightStatus = new String[number];

        //Taking input for height and weight of each person
        for (int i = 0; i < number; i++) {

            System.out.println("Enter details for person " + (i + 1));

            //Taking height input and validating
            System.out.print("Enter height in meters: ");
            personData[i][0] = sc.nextDouble();
            if (personData[i][0] <= 0) {
                System.err.println("Invalid height. Enter a positive value.");
                i--;
                continue;
            }

            //Taking weight input and validating
            System.out.print("Enter weight in kg: ");
            personData[i][1] = sc.nextDouble();
            if (personData[i][1] <= 0) {
                System.err.println("Invalid weight. Enter a positive value.");
                i--;
                continue;
            }
        }

        //Calculating BMI and determining weight status
        for (int i = 0; i < number; i++) {

            //BMI Formula: weight / (height * height)
            personData[i][2] = personData[i][1] /
                               (personData[i][0] * personData[i][0]);

            //Determining weight status using BMI table
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } 
            else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } 
            else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } 
            else {
                weightStatus[i] = "Obese";
            }
        }

        //Displaying height, weight, BMI and weight status of each person
        System.out.println("\nBMI Report:");
        for (int i = 0; i < number; i++) {
            System.out.println(
                "Person " + (i + 1) +
                " | Height: " + personData[i][0] +
                " | Weight: " + personData[i][1] +
                " | BMI: " + personData[i][2] +
                " | Status: " + weightStatus[i]
            );
        }
    }
}
