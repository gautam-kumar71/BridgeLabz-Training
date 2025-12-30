// 15. Rohan’s Library Reminder App 
// Rohan wants a fine calculator:
// ● Input return date and due date.
// ● If returned late, calculate fine: ₹5/day.
// ● Repeat for 5 books using for-loop.

import java.util.Scanner;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Loop for 5 books
        for (int book = 1; book <= 5; book++) {

            System.out.println("\nBook " + book);

            // Input due date
            System.out.print("Enter Due Date (in days): ");
            int dueDate = sc.nextInt();

            // Input return date
            System.out.print("Enter Return Date (in days): ");
            int returnDate = sc.nextInt();

            // Check if the book is returned late
            if (returnDate > dueDate) {

                // Calculate number of late days
                int lateDays = returnDate - dueDate;

                // Fine calculation (₹5 per day)
                int fine = lateDays * 5;

                System.out.println("Returned Late by " + lateDays + " days.");
                System.out.println("Fine Amount: ₹" + fine);

            } else {
                // No fine if returned on time or early
                System.out.println("Returned on time. No fine");
            }
        }

        // Close scanner resource
        sc.close();
    }
}
