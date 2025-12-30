import java.util.*;

//Create class TrainReservationSystem to book tickets 
public class TrainReservationSystem {

    static int totalSeats;
    static int availableSeats;
    static String tickets[];
    static int ticketIndex = 0;

    static Scanner sc = new Scanner(System.in);

    //method to get the menu
    public static void getMenu() {
        System.out.println("\n============== Train Reservation System ==============");
        System.out.println("1. Display Menu");
        System.out.println("2. Display Booked Tickets");
        System.out.println("3. Book Ticket");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    //method to book ticket
    public static void bookTicket() {
        if (availableSeats > 0) {
            sc.nextLine(); // clear buffer
            System.out.print("Enter passenger name: ");
            String name = sc.nextLine();

            tickets[ticketIndex++] = name;
            availableSeats--;

            System.out.println("Ticket booked successfully!");
            System.out.println("Seats remaining: " + availableSeats);
        }
    }

    //method to display booked tickets
    public static void displayBookedTickets() {
        if (ticketIndex == 0) {
            System.out.println("No tickets booked yet.");
            return;
        }

        System.out.println("\nBooked Tickets:");
        for (int i = 0; i < ticketIndex; i++) {
            System.out.println((i + 1) + ". " + tickets[i]);
        }
    }

    //method to initiate the booking process
    public static void startBooking() {

        do {
            System.out.print("Enter total seats available (must be > 0): ");
            totalSeats = sc.nextInt();
        } while (totalSeats <= 0);

        availableSeats = totalSeats;
        tickets = new String[totalSeats];

        while (true) {

            if (availableSeats == 0) {
                System.out.println("All seats are booked. Booking closed!");
                break;
            }

            getMenu();

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    getMenu();
                    break;
                case 2:
                    displayBookedTickets();
                    break;
                case 3:
                    bookTicket();
                    break;
                case 4:
                    System.out.println("Thank you for using Train Reservation System!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void main(String[] args) {
        startBooking();
    }
}
