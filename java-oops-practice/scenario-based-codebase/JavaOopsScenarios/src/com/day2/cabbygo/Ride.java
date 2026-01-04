package com.day2.cabbygo;


public class Ride {

    private Vehicle vehicle;
    private Driver driver;
    private double distance; // kilometres
    private double fare;    

    public Ride(Vehicle vehicle, Driver driver, double distance) {
        this.vehicle = vehicle;
        this.driver = driver;
        this.distance = distance;
        this.fare = vehicle.calculateFare(distance);
    }

    // Only expose summary, not internal fare logic
    public void rideSummary() {
        System.out.println("Driver: " + driver.getName());
        System.out.println("Vehicle: " + vehicle.getType());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + fare);
    }
}
