package org.example.amazonlocker;

import java.util.ArrayList;
import java.util.List;

public class AmazonLocker {

    private static AmazonLocker amazonLocker = null;
    private List<LockerLocation> lockerLocations;
    private AmazonLocker(){
        lockerLocations =  new ArrayList<>();
    }

    public static AmazonLocker getAmazonLocker(){
        if(amazonLocker==null){
            amazonLocker = new AmazonLocker();
        }
        return amazonLocker;
    }

    public void addLockerLocation(LockerLocation lockerLocation){
        lockerLocations.add(lockerLocation);
    }
}
