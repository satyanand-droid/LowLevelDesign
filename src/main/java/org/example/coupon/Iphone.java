package org.example.coupon;

public class Iphone  extends Product{

    public Iphone(String name,Double cost){
        this.name = name;
        this.cost = cost;
    }
    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public String description() {
        return "cost is " + this.getCost() + " for iphone";
    }

}
