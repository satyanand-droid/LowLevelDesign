package org.example.carrentalsystem;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Store {

    public Store(String id,Location location) {
        this.id = id;
        this.vehicleInventory = new VehicleInventory();
        this.location = location;
        this.reservation = new ArrayList<>();
    }

    String id;
    VehicleInventory vehicleInventory;
    Location location;
    List<Reservation> reservation;

    Reservation makeReservation(Vehicle vehicle, User user){
        return new Reservation(vehicle, Instant.now(), Instant.now(),user, ReservationStatus.ACTIVE);
    }
}
