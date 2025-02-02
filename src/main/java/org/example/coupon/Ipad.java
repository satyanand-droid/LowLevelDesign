package org.example.coupon;

public class Ipad extends Product{

    public Ipad(String name,Double cost){
        this.name = name;
        this.cost = cost;
    }
    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public String description() {
        return "cost is "+this.cost + " for ipad";
    }
}
