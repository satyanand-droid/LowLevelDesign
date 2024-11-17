package org.example.carrentalsystem;

public class Bill {
    Reservation reservation;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
    }

    double calculateBillAmount(){
        return 110;
    }
}
