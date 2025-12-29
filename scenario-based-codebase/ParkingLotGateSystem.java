import java.util.Scanner;

public class ParkingLotGateSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total capacity");
        int capacity =sc.nextInt();       // Total parking slots
        int parkedCars = 0;     // Current parked cars
        int choice;

        // Loop continues until parking is full or user exits
        while (parkedCars < capacity) {

            System.out.println("\n--- Parking Lot Menu ---");
            System.out.println("1. Park Car");
            System.out.println("2. Exit Car");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: // Park Car
                    if (parkedCars < capacity) {
                        parkedCars++;
                        System.out.println("Car parked successfully.");
                    } else {
                        System.out.println("Parking Lot Full!");
                    }
                    break;

                case 2: // Exit Car
                    if (parkedCars > 0) {
                        parkedCars--;
                        System.out.println("Car exited successfully.");
                    } else {
                        System.out.println("No cars to exit.");
                    }
                    break;

                case 3: // Show Occupancy
                    System.out.println("Occupied Slots: " + parkedCars);
                    System.out.println("Available Slots: " + (capacity - parkedCars));
                    break;

                case 4: // Exit system
                    System.out.println("Exiting Parking System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        System.out.println("Parking Lot is FULL!");
        sc.close();
    }
}
