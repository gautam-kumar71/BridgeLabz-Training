package com.day2.cabbygo;

public class CabbyGoApp {

    public static void main(String[] args) {

        Vehicle vehicle = new Sedan("MH12AB1234"); 
        Driver driver = new Driver("Animesh", "LIC1655", 6.4);

        IRideService rideService = new RideService();

        Ride ride = rideService.bookRide(vehicle, driver, 12.9);
        rideService.endRide(ride);
    }
}
