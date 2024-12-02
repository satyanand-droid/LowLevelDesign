package org.example.amazonlocker;

public class Notification {
    private Locker locker;
    private Order order;
    private Customer customer;
    private int code;

    public Notification(Locker locker, Order order, Customer customer, int code) {
        this.locker = locker;
        this.order = order;
        this.customer = customer;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "locker=" + locker +
                ", order=" + order +
                ", customer=" + customer +
                ", code=" + code +
                '}';
    }

    public void sendNotification(){
         System.out.println(this);
    }
}
