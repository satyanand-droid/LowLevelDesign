package org.example.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private int freeSmallSpots;
    private int freeCompactSpots;
    private int freeLargeSpots;
    private ParkingManager parkingManager;
    private List<ParkingSpot> parkingSpots = new ArrayList<>();
    private Entry entry;

    public Entry getEntry() {
        return entry;
    }

    public ParkingLot(int freeSmallSpots, int freeCompactSpots, int freeLargeSpots) {
        this.freeSmallSpots = freeSmallSpots;
        this.freeCompactSpots = freeCompactSpots;
        this.freeLargeSpots = freeLargeSpots;
        createParkingSpots(freeCompactSpots,freeLargeSpots,freeSmallSpots);
        parkingManager = new ParkingManager(parkingSpots);
        entry = new Entry("1", parkingManager);
    }

    private void createParkingSpots(int freeCompactSpots, int freeLargeSpots, int freeSmallSpots) {
       for(int i=0;i<freeCompactSpots;i++){
           ParkingSpot parkingSpot = new ParkingSpot(ParkingSpotType.COMPACT);
           parkingSpots.add(parkingSpot);
       }
        for(int i=0;i<freeLargeSpots;i++){
            ParkingSpot parkingSpot = new ParkingSpot(ParkingSpotType.LARGE);
            parkingSpots.add(parkingSpot);
        }
        for(int i=0;i<freeSmallSpots;i++){
            ParkingSpot parkingSpot = new ParkingSpot(ParkingSpotType.SMALL);
            parkingSpots.add(parkingSpot);
        }

    }
}
