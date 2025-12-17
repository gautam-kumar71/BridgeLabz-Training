//Create KilometersToMiles Class to convert distance from kilometers to miles
public class KilometersToMiles{
    public static void main(String args[])
    {
        //Create a variable distance to store the distance in kilometers
        float distance=10.8f;
        
        // Calculate distance in miles
        float distanceInMiles=distance*1.6f;
        
        //Display the distance in miles
        System.out.println("The distance "+distance+" km in miles is "+distanceInMiles);
    }
}
