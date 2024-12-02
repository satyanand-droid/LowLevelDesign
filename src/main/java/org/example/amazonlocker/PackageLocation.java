package org.example.amazonlocker;

public class PackageLocation {
    private Package aPackage;
    private Locker locker;
    private int validDays;
    private int code;


    public PackageLocation(Package aPackage, Locker locker, int validDays, int code) {
        this.aPackage = aPackage;
        this.locker = locker;
        this.validDays = validDays;
        this.code = code;
    }

    public boolean validateCode(int code){
        return code==this.code;
    }


}
