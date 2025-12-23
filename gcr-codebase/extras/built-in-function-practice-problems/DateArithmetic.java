import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take date input from user
        System.out.print("Enter date (yyyy-mm-dd): ");
        String inputDate = sc.nextLine();

        // Convert input string to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Add 7 days
        date = date.plusDays(7);

        // Add 1 month
        date = date.plusMonths(1);

        // Add 2 years
        date = date.plusYears(2);

        // Subtract 3 weeks
        date = date.minusWeeks(3);

        // Display final date
        System.out.println("Final Date after calculations: " + date);
    }
}
