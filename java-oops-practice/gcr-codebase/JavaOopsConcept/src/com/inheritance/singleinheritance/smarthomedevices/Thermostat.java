package com.inheritance.singleinheritance.smarthomedevices;


public class Thermostat extends Device {

    private int temperatureSetting;

    // Constructor
    public Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding method
    @Override
    public void displayStatus() {
        super.displayStatus(); // display base info
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
