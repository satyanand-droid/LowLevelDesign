package org.example.parkinglot;

public abstract class Exit {
    private String id;

    public abstract int calculateAmount(Ticket ticket);
    public abstract void unparkVehicle();
}
