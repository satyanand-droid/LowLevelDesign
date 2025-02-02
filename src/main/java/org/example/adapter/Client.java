package org.example.adapter;

public class Client {
    public static void main(String[] args){

    Payment payment = new Adaptee(new PaymentB());
        payment.pay(23);
    }
}
