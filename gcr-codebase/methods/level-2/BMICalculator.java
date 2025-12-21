import java.util.Scanner;

// Create class BMICalculator to calculate BMI and status of persons
public class BMICalculator {

    // Method to calculate BMI and populate the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    // Method to determine BMI status using given ranges
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] personData = new double[10][3];

        for (int i = 0; i < personData.length; i++) {

            // Taking input from the user
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();
        }

        calculateBMI(personData);
        String[] bmiStatus = determineBMIStatus(personData);

        System.out.println("\nBMI Report");
        System.out.println("Person\tWeight\tHeight\tBMI\t\tStatus");

        for (int i = 0; i < personData.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                personData[i][0] + "\t" +
                personData[i][1] + "\t" +
                String.format("%.2f", personData[i][2]) + "\t" +
                bmiStatus[i]
            );
        }

        input.close();
    }
}
