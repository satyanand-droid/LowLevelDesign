package org.example.parkinglot;

public class ParkingSpot {
    private Vehicle vehicle;
    private boolean isFree;
    private ParkingSpotType parkingSpotType;

    public ParkingSpot(ParkingSpotType parkingSpotType){
        this.parkingSpotType = parkingSpotType;
        this.isFree = true;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }
}
