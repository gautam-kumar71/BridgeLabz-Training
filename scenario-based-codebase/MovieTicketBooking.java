// 14. Movie Ticket Booking App 🎬
// Ask users for movie type, seat type (gold/silver), and snacks.
// ● Use switch and if together.
// ● Loop through multiple customers.
// ● Clean structure and helpful variable names.
import java.util.*;

public class MovieTicketBooking {

    static int totalSeats;
    static int availableSeats;

    //method to book ticket
    public static void bookMovie(Scanner sc) {

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.println("Select Movie:");
        System.out.println("1. Banjara");
        System.out.println("2. Taare Zameen Par");
        System.out.println("3. Life of Pi");
        int movieChoice = sc.nextInt();

        String movieName = "";

        switch (movieChoice) {
            case 1:
                movieName = "Banjara";
                break;
            case 2:
                movieName = "Taare Zameen Par";
                break;
            case 3:
                movieName = "Life of Pi";
                break;
            default:
                System.out.println("Invalid movie choice!");
                return;
        }

        System.out.println("Select Seat Type:");
        System.out.println("1. Gold");
        System.out.println("2. Silver");
        int seatChoice = sc.nextInt();

        int seatPrice = 0;
        if (seatChoice == 1) {
            seatPrice = 300;
        } else if (seatChoice == 2) {
            seatPrice = 200;
        } else {
            System.out.println("Invalid seat type!");
            return;
        }

        System.out.print("Do you want snacks? (yes/no): ");
        sc.nextLine(); // clear buffer
        String snacks = sc.nextLine();

        int snackPrice = 0;
        if (snacks.equalsIgnoreCase("yes")) {
            snackPrice = 100;
        }

        int totalPrice = seatPrice + snackPrice;
        availableSeats--;

        System.out.println("\n----- Ticket Booked -----");
        System.out.println("Customer: " + customerName);
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Type: " + (seatChoice == 1 ? "Gold" : "Silver"));
        System.out.println("Snacks: " + snacks);
        System.out.println("Total Price: Rs." + totalPrice);
        System.out.println("Seats Remaining: " + availableSeats);
        System.out.println("-------------------------\n");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total seats available: ");
        totalSeats = sc.nextInt();
        availableSeats = totalSeats;
        sc.nextLine(); // clear buffer

        while (availableSeats > 0) {
            bookMovie(sc);

            System.out.print("Book another ticket? (yes/no): ");
            String choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Booking closed. Thank you!");
        sc.close();
    }
}
