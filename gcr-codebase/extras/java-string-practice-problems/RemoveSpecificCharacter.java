import java.util.Scanner;

public class RemoveSpecificCharacter {

    // Method to remove specific character
    static String removeCharacter(String text, char removeChar) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != removeChar)
                result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        System.out.println("Modified String: " +
                            removeCharacter(text, ch));
    }
}
