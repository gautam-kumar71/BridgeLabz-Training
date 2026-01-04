package com.day2.cabbygo;


public class RideService implements IRideService {

    @Override
    public Ride bookRide(Vehicle vehicle, Driver driver, double distance) {
        System.out.println("Ride booked successfully!");
        return new Ride(vehicle, driver, distance);
    }

    @Override
    public void endRide(Ride ride) {
        System.out.println("Ride ended. Thanks for riding with CabbyGo. Keep visiting again!");
        ride.rideSummary();
    }
}
