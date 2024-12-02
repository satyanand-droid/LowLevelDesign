package org.example.movieticketbooking;

import java.util.List;

public class Admin extends Person{

    public Admin() {
    }

    public Movie addMovie(String name, int runtime){
        return new Movie(name, runtime);
    }

    public Show addShow(Movie movie, Screen screen){
         return new Show(movie,screen);
    }

    public Screen addScreen(String name, List<Seat> seats){
            return new Screen(seats,name);
    }


}
