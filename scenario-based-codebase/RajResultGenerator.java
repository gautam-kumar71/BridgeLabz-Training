import java.util.Scanner;

public class RajResultGenerator {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Array to store marks of 5 subjects
        int[] marks = new int[5];

        // Variable to store sum of marks
        int sum = 0;

        // Loop to take marks for each subject
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            // Add marks to sum
            sum = sum + marks[i];
        }

        // Calculate average marks
        int average = sum / 5;

        // Variable to store grade
        char grade;

        // Assign grade using switch-case based on average
        switch (average / 10) {

            case 10:
            case 9:
                grade = 'A';
                break;

            case 8:
            case 7:
                grade = 'B';
                break;

            case 6:
                grade = 'C';
                break;

            case 5:
            case 4:
                grade = 'D';
                break;

            default:
                grade = 'F';
        }

        // Display result
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        // Close Scanner
        sc.close();
    }
}
