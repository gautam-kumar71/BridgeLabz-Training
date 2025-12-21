import java.util.Scanner;

// Create class FriendComparison
public class FriendComparison {

    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int age : ages) {
            if (age < min) min = age;
        }
        return min;
    }

    public static double findTallest(double[] heights) {
        double max = heights[0];
        for (double height : heights) {
            if (height > max) max = height;
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {

            // Taking input from the user
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height of friend " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }

        System.out.println("Youngest age is " + findYoungest(ages));
        System.out.println("Tallest height is " + findTallest(heights));

        input.close();
    }
}
