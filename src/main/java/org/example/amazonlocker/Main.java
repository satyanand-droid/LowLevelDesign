package org.example.amazonlocker;

public class Main {
    public static void main(String[] args){
        AmazonLocker amazonLocker = AmazonLocker.getAmazonLocker();
        LockerLocation lockerLocation =  new LockerLocation();
        amazonLocker.addLockerLocation(lockerLocation);
        Locker locker = new Locker(LockerSize.L);
        lockerLocation.addLocker(locker);

    }
}
