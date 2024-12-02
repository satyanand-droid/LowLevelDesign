package org.example.amazonlocker;

public class Package {
    private Order order;
    private String packageSize;

    public Package(Order order, String packageSize) {
        this.order = order;
        this.packageSize = packageSize;
    }
}
