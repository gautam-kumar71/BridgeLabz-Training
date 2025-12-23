import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find most frequent character
    static char mostFrequentChar(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        char maxChar = text.charAt(0);

        for (int i = 1; i < text.length(); i++) {
            if (freq[text.charAt(i)] > freq[maxChar])
                maxChar = text.charAt(i);
        }
        return maxChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Most Frequent Character: " +
                            mostFrequentChar(input));
    }
}
