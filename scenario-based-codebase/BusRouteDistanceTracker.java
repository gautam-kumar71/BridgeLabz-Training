import java.util.Scanner;

public class BusRouteDistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variable to store total distance travelled
        int totalDistance = 0;

        
        boolean isTravelling = true;

        
        while (isTravelling) {

            // Distance covered till next stop
            System.out.print("Enter distance covered at this stop (in km): ");
            int distance = sc.nextInt();

            
            totalDistance += distance;

            // Ask passenger if they want to get off
            System.out.print("Do you want to get off the bus? (yes/no): ");
            String decision = sc.next().toLowerCase();

            // If user says yes, stop the loop
            if (decision.equals("yes")) {
                isTravelling = false;
            }
        }

        
        System.out.println("Total distance travelled: " + totalDistance + " km");
    }
}
