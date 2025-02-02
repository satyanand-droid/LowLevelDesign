package org.example.coupon;

public class SaleCoupon extends Product{
    Product product;

    public SaleCoupon(Product product) {
        this.product = product;
    }

    @Override
    public double getCost() {
        return this.product.getCost() * .9 ;
    }

    @Override
    public String description() {
        return  this.product.description() + " added sale coupon";
    }
}
