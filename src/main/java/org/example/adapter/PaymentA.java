package org.example.adapter;

public class PaymentA implements Payment{
    @Override
    public void pay(int amount) {
    System.out.println("making the payment "+amount);
    }
}
