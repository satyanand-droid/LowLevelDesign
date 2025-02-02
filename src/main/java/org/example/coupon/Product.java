package org.example.coupon;

public abstract class Product {
    String name;
    Double cost;
    abstract public double getCost();
    abstract public String description();
}
