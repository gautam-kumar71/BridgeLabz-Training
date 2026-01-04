package com.day2.cabbygo;

abstract class Vehicle {

    private String vehicleNumber;
    private int capacity;
    private String type;

    Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    abstract double getRatePerKm(); 

    public double calculateFare(double distance) {
        double baseFare = 50;
        return baseFare + (distance * getRatePerKm());
    }

    public String getType() {
        return type;
    }
}
