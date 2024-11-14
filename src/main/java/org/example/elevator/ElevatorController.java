package org.example.elevator;

public class ElevatorController {
    Elevator elevator;

    public void acceptRequest(int floor, Direction dir){
        elevator.move(floor, dir);
    }
}
