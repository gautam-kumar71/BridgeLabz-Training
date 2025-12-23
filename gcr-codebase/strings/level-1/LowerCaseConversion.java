import java.util.Scanner;

public class LowerCaseConversion {

    // Method to convert text to lowercase using charAt() and ASCII logic
    public static String convertToLowerCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // ASCII conversion
            }

            result = result + ch;
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take complete text input
        System.out.println("Enter the complete text:");
        String text = scanner.nextLine();

        // User-defined lowercase conversion
        String customLowerCase = convertToLowerCase(text);

        // Built-in lowercase conversion
        String builtInLowerCase = text.toLowerCase();

        // Compare both strings
        boolean isSame = compareStrings(customLowerCase, builtInLowerCase);

        // Display results
        System.out.println("\nCustom Lowercase Text: " + customLowerCase);
        System.out.println("Built-in Lowercase Text: " + builtInLowerCase);
        System.out.println("Are both strings equal? " + isSame);

        scanner.close();
    }
}
