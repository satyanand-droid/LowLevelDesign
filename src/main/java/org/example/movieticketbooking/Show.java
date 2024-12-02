package org.example.movieticketbooking;

import java.util.ArrayList;
import java.util.List;

public class Show {
     Movie movie;
     Screen screen;
     List<Integer> bookedSeatIds;

     public Show(Movie movie, Screen screen) {
          this.movie = movie;
          this.screen = screen;
          bookedSeatIds = new ArrayList<>();
     }

     public void addBookedSeats(List<Integer> seatIds){
          bookedSeatIds.addAll(seatIds);
     }
}
