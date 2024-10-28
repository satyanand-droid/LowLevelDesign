package org.example.observer.notification;

public interface Observer {
  public void sendNotification(String orderId, int price);
}
