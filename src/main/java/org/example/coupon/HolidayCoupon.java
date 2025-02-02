package org.example.coupon;

public class HolidayCoupon extends Product{

    Product product;

    public HolidayCoupon(Product product) {
        this.product = product;
    }

    @Override
    public double getCost() {
        return this.product.getCost() * 0.9;

    }

    @Override
    public String description() {
        return this.product.description() + " added the holiday coupon";
    }
}
