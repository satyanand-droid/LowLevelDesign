package org.example.amazonlocker;

import java.util.ArrayList;
import java.util.List;

public class LockerLocation {
    private String id;
    private List<Locker> lockers;
    private String longitude;
    private String latitude;

    public LockerLocation() {
    this.lockers = new ArrayList<>();
    }

    public List<Locker> getLockers() {
        return lockers;
    }

    public void addLocker(Locker locker){
        lockers.add(locker);
    }

}
