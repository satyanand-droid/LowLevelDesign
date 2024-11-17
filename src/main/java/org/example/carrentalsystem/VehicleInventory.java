package org.example.carrentalsystem;

import java.util.List;

public class VehicleInventory {
    List<Vehicle> vehicles;

    void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }
}
