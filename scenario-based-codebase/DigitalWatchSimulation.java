// 16. Digital Watch Simulation ⏱️
// Simulate a 24-hour watch:
// ● Print hours and minutes in a nested for-loop.
// ● Use a break to stop at 13:00 manually (simulate power cut).
// Core Java Scenario Based Problem Statements


import java.time.LocalTime;

public class DigitalWatchSimulation {

    public static void main(String[] args) {

        // Start time at 00:00
        LocalTime time = LocalTime.of(0, 0);

        // Outer loop for 24 hours
        for (int hour = 0; hour < 24; hour++) {

            // Inner loop for 60 minutes
            for (int minute = 0; minute < 60; minute++) {

                // Print time in HH:MM format
                System.out.printf("%02d:%02d\n",
                        time.getHour(),
                        time.getMinute());

                // Power cut at 13:00
                if (time.getHour() == 13 && time.getMinute() == 0) {
                    System.out.println("Power cut! Watch stopped.");
                    return; // exits both loops
                }

                // Move time forward by 1 minute
                time = time.plusMinutes(1);
            }
        }
    }
}
