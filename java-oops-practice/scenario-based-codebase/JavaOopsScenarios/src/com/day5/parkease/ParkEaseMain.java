package com.day5.parkease;

public class ParkEaseMain {

    public static void main(String[] args) {

        ParkingSlot slot1 = new ParkingSlot("A1", "Car");
        Vehicle car = new Car("JK32AB1234");

        ParkingManager manager = new ParkingManager();

        manager.assignSlot(slot1, car);
        manager.releaseSlot(slot1, 4);
    }
}
