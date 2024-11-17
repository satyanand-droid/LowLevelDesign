package org.example.carrentalsystem;

public class Main {
    public static void main(String[] args){
        User user = new User("satyanand");
        Location location = new Location("noida","uttar pradesh",20123,"near lal chowk");
        Store store = new Store("1", location);
        CarRental carRental = new CarRental();
        carRental.addUser(user);
        carRental.addStore(store);
        Vehicle vehicle =  new Vehicle(1.01, 11.01, VehicleType.CAR);
        store.vehicleInventory.addVehicle(vehicle);
        Reservation reservation = store.makeReservation(vehicle,user);
        Bill bill = new Bill(reservation);
        Double amount = bill.calculateBillAmount();
        Payment payment = new Payment();
        payment.makePayment();



    }
}
