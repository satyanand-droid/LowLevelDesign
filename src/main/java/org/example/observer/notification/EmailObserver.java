package org.example.observer.notification;

public class EmailObserver implements Observer {
  private Subject order;

  public EmailObserver(Subject order) {
    order.register(this);
  }

  @Override
  public void sendNotification(String orderId, int price) {
    System.out.println(
        "Email :Order is placed with order id " + orderId + " with total cost of " + price);
  }
}
