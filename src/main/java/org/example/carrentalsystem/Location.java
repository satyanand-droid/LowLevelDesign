package org.example.carrentalsystem;

public class Location {
    public Location(String city, String state, int pincode, String address) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.address = address;
    }

    String city;
    String state;
    int pincode;
    String address;
}
