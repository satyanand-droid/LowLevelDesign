package org.example.parkinglot;

import java.sql.Time;

public class Ticket {
    private ParkingSpot parkingSpot;
    private Time entranceTime;

    public Ticket(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Time getEntranceTime() {
        return entranceTime;
    }

    public void setEntranceTime(Time entranceTime) {
        this.entranceTime = entranceTime;
    }
}
