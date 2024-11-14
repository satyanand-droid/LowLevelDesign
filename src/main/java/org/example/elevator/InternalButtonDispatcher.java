package org.example.elevator;

import java.util.List;

public class InternalButtonDispatcher {
    List<ElevatorController> elevatorControllerList;
    public void submit(){
        for(int i=0;i<elevatorControllerList.size();i++){
            elevatorControllerList.get(i).acceptRequest(1,Direction.DOWN);
        }
    }
}

