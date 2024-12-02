package org.example.movieticketbooking;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        MovieTicketBooking movieTicketBooking = MovieTicketBooking.getMovieTicketBooking();
        Admin admin = movieTicketBooking.getAdmin();
        Movie movie = admin.addMovie("ddlj",123);
        List<Seat> seats = new ArrayList<>();
        for(int i=0;i<10;i++){
            Seat seat = new Seat();
            seats.add(seat);
        }
        Screen screen = admin.addScreen("one",seats);
        // logic skipped in interest of time
    }
}
