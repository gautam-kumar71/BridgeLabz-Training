import java.util.Scanner;

public class UpperCaseConversion {

    // Method to convert text to uppercase using charAt() and ASCII logic
    public static String convertToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int convert=(int)ch;
            // Check if character is lowercase (a-z)
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (convert- 32); // ASCII conversion
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

        // User-defined uppercase conversion
        String customUpperCase = convertToUpperCase(text);

        // Built-in uppercase conversion
        String builtInUpperCase = text.toUpperCase();

        // Compare both strings
        boolean isSame = compareStrings(customUpperCase, builtInUpperCase);

        // Display results
        System.out.println("\nCustom Uppercase Text: " + customUpperCase);
        System.out.println("Built-in Uppercase Text: " + builtInUpperCase);
        System.out.println("Are both strings equal? " + isSame);

        scanner.close();
    }
}
