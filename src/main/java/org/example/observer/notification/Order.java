package org.example.observer.notification;

import java.util.ArrayList;
import java.util.List;

public class Order implements Subject {

  List<Observer> observers;
  private String orderId;
  private int price;

  public Order() {
    observers = new ArrayList<>();
  }

  @Override
  public void register(Observer o) {
    observers.add(o);
  }

  @Override
  public void remove(Observer o) {
    int index = observers.indexOf(o);
    if (index >= 0) {
      observers.remove(index);
    }
  }

  @Override
  public void notifyObserver() {
    for (Observer o : observers) {
      o.sendNotification(this.orderId, this.price);
    }
  }

  public void setOrder(String orderId, int price) {
    this.price = price;
    this.orderId = orderId;
    notifyObserver();
  }
}
