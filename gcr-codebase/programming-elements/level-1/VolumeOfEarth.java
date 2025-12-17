//Create VolumeOfEarth class to compute volume of Earth
public class VolumeOfEarth {
    public static void main(String[] args) {

        // Radius of Earth in kilometers
        double radiusKm = 6378;

        // Value of PI
        double pi = Math.PI;

        // Volume formula: (4/3) * pi * r^3
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert cubic kilometers to cubic miles
        double volumeMiles = volumeKm / Math.pow(1.6, 3);

        // Display the result
        System.out.println("The volume of earth in cubic kilometers is " 
                            + volumeKm + 
                            " and cubic miles is " + volumeMiles);
    }
}

