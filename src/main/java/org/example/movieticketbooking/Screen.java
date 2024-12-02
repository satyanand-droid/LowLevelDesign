package org.example.movieticketbooking;

import java.util.List;

public class Screen {
    String name;
    List<Seat> seats;

    public Screen(List<Seat> seats, String name) {
        this.seats = seats;
        this.name = name;
    }
}
