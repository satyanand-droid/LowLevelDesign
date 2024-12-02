package org.example.amazonlocker;

public class Locker {
    private String id;
    private LockerSize lockerSize;
    private LockerState lockerState;

    public Locker(LockerSize lockerSize) {
        this.lockerSize = lockerSize;
        lockerState = LockerState.AVAILABLE;
    }

    public void setLockerState(LockerState lockerState) {
        this.lockerState = lockerState;
    }

    public LockerState getLockerState() {
        return lockerState;
    }
}
