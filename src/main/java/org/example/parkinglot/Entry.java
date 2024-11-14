package org.example.parkinglot;

import java.sql.Time;

public class Entry {
    private String id;
    ParkingManager parkingManager;

    public Entry(String id, ParkingManager parkingManager) {
        this.id = id;
        this.parkingManager = parkingManager;
    }

    public Ticket generateTicket(ParkingSpot parkingSpot){
        Ticket ticket = new Ticket(parkingSpot);
        ticket.setEntranceTime(new Time(0));
        return ticket;
    }
    public boolean parkVehicle(Vehicle vehicle){
        ParkingSpot parkingSpot = parkingManager.findParkingSpot(vehicle.getVehicleType());
        if(parkingSpot==null){
                System.out.println("no spot found");
                return false;
        }
        parkingManager.parkVehicle(parkingSpot,vehicle);
        return true;

    }

    public void unparkVehicle(ParkingSpot parkingSpot){
        parkingManager.unparkVehicle(parkingSpot);
    }

}
