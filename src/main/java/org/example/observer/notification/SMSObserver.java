package org.example.observer.notification;

public class SMSObserver implements Observer {
  private Subject order;

  public SMSObserver(Subject order) {
    order.register(this);
  }

  @Override
  public void sendNotification(String orderId, int price) {
    System.out.println(
        "SMS :Order is placed with order id " + orderId + " with total cost of " + price);
  }
}
