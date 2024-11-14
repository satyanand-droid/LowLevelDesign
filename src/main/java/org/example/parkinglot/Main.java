package org.example.parkinglot;

public class Main {
    public static void main(String[] args){
        ParkingLot parkingLot = new ParkingLot(3,3,3);
        Entry entry = parkingLot.getEntry();
        Vehicle vehicle = new Vehicle(VehicleType.CAR);
        entry.parkVehicle(vehicle);

    }
}
