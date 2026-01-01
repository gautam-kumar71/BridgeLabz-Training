package com.inheritance.introduction.vehicleandtransportsystem;


public class VehicleTest {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 10),
            new Motorcycle(150, "Petrol", true)
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("--------------------");
        }
    }
}
