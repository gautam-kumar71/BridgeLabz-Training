import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicate characters
    static String removeDuplicates(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Add character only if not already present
            if (result.indexOf(ch) == -1)
                result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("After removing duplicates: " +
                            removeDuplicates(input));
    }
}
