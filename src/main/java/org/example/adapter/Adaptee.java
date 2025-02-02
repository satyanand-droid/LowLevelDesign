package org.example.adapter;

public class Adaptee implements Payment{

    PaymentB paymentB;

    public Adaptee(PaymentB paymentB) {
        this.paymentB = paymentB;
    }

    @Override
    public void pay(int amount) {
        paymentB.makePayment(amount);
    }
}
