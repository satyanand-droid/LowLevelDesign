package org.example.carrentalsystem;

import java.time.Instant;

public class Reservation {
    Vehicle vehicle;
    Instant bookedFrom;
    Instant bookedTill;
    User user;
    ReservationStatus reservationStatus;

    public Reservation(Vehicle vehicle, Instant bookedFrom, Instant bookedTill, User user, ReservationStatus reservationStatus) {
        this.vehicle = vehicle;
        this.bookedFrom = bookedFrom;
        this.bookedTill = bookedTill;
        this.user = user;
        this.reservationStatus = reservationStatus;
    }
}
