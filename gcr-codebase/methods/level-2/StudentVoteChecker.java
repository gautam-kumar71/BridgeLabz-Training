import java.util.Scanner;

// Create class StudentVoteChecker
public class StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {

            // Taking input from the user
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            if (checker.canStudentVote(ages[i])) {
                System.out.println("Can Vote");
            } else {
                System.out.println("Cannot Vote");
            }
        }

        input.close();
    }
}
