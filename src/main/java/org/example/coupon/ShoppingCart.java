package org.example.coupon;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> products;
    double totalCost;

    public ShoppingCart(){
        this.products = new ArrayList<>();
        this.totalCost = 0.0;
    }

    public void addProductToCart(Product product){
        products.add(product);
    }


    public double getTotalCost(){
        for(Product product:products){
            totalCost = totalCost+ product.getCost();
        }
        return totalCost;
    }
}
