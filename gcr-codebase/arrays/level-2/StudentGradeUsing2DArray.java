import java.util.Scanner;

//Create StudentGradeUsing2DArray class to calculate percentage and grade
public class StudentGradeUsing2DArray {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Taking input for number of students
        System.out.println("Enter number of students:");
        int students = sc.nextInt();

        //Create 2D array to store marks
        //marks[i][0] -> Physics, marks[i][1] -> Chemistry, marks[i][2] -> Maths
        int[][] marks = new int[students][3];

        //Create arrays to store percentage and grade
        double[] percentage = new double[students];
        char[] grade = new char[students];

        //Taking input for marks
        for (int i = 0; i < students; i++) {

            System.out.println("Enter marks for student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();

            //Validation for negative marks
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.err.println("Invalid marks. Please enter positive values.");
                i--; //Decrement index to re-enter
            }
        }

        //Calculating percentage and grade
        for (int i = 0; i < students; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            //Determining grade based on percentage
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        //Displaying result
        System.out.println("\nStudent Report:");
        for (int i = 0; i < students; i++) {
            System.out.println(
                "Student " + (i + 1) +
                " | Physics: " + marks[i][0] +
                " | Chemistry: " + marks[i][1] +
                " | Maths: " + marks[i][2] +
                " | Percentage: " + percentage[i] +
                " | Grade: " + grade[i]
            );
        }
    }
}
