package com.day2.cabbygo;

interface IRideService {

    Ride bookRide(Vehicle vehicle, Driver driver, double distance);

    void endRide(Ride ride);
}
