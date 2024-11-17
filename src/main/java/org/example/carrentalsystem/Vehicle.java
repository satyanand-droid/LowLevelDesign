package org.example.carrentalsystem;

public class Vehicle {
    String id;
    String vehicleNo;
    String manufacturingdate;
    int distanceTravelled;
    VehicleStatus status;
    VehicleType vehicleType;
    double dayPrice;
    double hourlyPrice;

    public Vehicle(double hourlyPrice, double dayPrice, VehicleType vehicleType) {
        this.hourlyPrice = hourlyPrice;
        this.dayPrice = dayPrice;
        this.vehicleType = vehicleType;
    }
}
