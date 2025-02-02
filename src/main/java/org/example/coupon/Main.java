package org.example.coupon;

public class Main {
    public static void main(String[] args){

        Product iphone = new Iphone("iphone 2",20.00);
        Product ipad = new Ipad("ipad", 40.00);
        ShoppingCart shoppingCart =  new ShoppingCart();
        Product holidayCoupon =  new HolidayCoupon(ipad);
        Product saleCoupon = new SaleCoupon(holidayCoupon);
        Product saleCoupon1 =  new SaleCoupon(iphone);
        System.out.println(saleCoupon1.getCost());
        System.out.println(saleCoupon.getCost());

        shoppingCart.addProductToCart(saleCoupon);
        shoppingCart.addProductToCart(saleCoupon1);
        System.out.println(shoppingCart.getTotalCost());
    }
}
