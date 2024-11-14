package org.example.parkinglot;

import java.util.List;

public class ParkingManager {
    private List<ParkingSpot> parkingSpots ;

    public ParkingManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingSpot findParkingSpot(VehicleType vehicleType){
        for(int i=0;i<parkingSpots.size();i++){
           ParkingSpot parkingSpot = parkingSpots.get(i);
           if(parkingSpot.getParkingSpotType().toString().equalsIgnoreCase("compact")){
               if(vehicleType.toString().equalsIgnoreCase("car")){
                   if(parkingSpot.isFree()){
                       return parkingSpot;
                   }
               }
           }
            if(parkingSpot.getParkingSpotType().toString().equalsIgnoreCase("small")){
                if(vehicleType.toString().equalsIgnoreCase("bike")){
                    if(parkingSpot.isFree()){
                        return parkingSpot;
                    }
                }
            }
            if(parkingSpot.getParkingSpotType().toString().equalsIgnoreCase("large")){
                if(vehicleType.toString().equalsIgnoreCase("truck")){
                    if(parkingSpot.isFree()){
                        return parkingSpot;
                    }
                }
            }


    }
    return null;
}

    public void parkVehicle(ParkingSpot parkingSpot, Vehicle vehicle){
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setFree(false);
    }

    public void unparkVehicle(ParkingSpot parkingSpot){
        parkingSpot.setVehicle(null);
        parkingSpot.setFree(true);
    }
}