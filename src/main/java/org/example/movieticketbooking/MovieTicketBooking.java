package org.example.movieticketbooking;

public class MovieTicketBooking {
        City city;
        Theathre theathre;
        Admin admin;
        User user ;
    public static MovieTicketBooking movieTicketBooking =null;
    private MovieTicketBooking(){
        city = new City();
        theathre = new Theathre();
        admin= new Admin();
        user= new User();
    }
    public static MovieTicketBooking getMovieTicketBooking(){
        if(movieTicketBooking==null){
            movieTicketBooking = new MovieTicketBooking();
        }
        return movieTicketBooking;
    }

    public City getCity() {
        return city;
    }

    public Theathre getTheathre() {
        return theathre;
    }

    public Admin getAdmin() {
        return admin;
    }

    public User getUser() {
        return user;
    }
}
