package org.example.observer.weather.station;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements State {

  private int temperature;
  private int pressure;
  private int humidity;
  private List<Observer> observers;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  @Override
  public void register(Observer o) {
    observers.add(o);
  }

  @Override
  public void remove(Observer o) {
    int index = observers.indexOf(o);
    if (index > 0) {
      observers.remove(index);
    }
  }

  @Override
  public void notifyObserver() {
    for (Observer o : observers) {
      o.update(temperature, pressure, humidity);
    }
  }

  public void measurementChanged() {
    notifyObserver();
  }

  public void setMeasurements(int temperature, int humidity, int pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
  }
}
