package org.example.observer.notification;

public class Main {
  public static void main(String[] args) {
    Order order = new Order();
    EmailObserver emailObserver = new EmailObserver(order);
    SMSObserver smsObserver = new SMSObserver(order);
    order.setOrder("1", 200);
  }
}
