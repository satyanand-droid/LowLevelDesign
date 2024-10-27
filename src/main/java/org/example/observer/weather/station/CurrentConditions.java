package org.example.observer.weather.station;

public class CurrentConditions implements Observer {
  @Override
  public void update(int temperature, int pressure, int humidity) {
    System.out.println("inside current conditions");
    System.out.println(
        "current conditions, temperature is "
            + temperature
            + "pressure "
            + pressure
            + " and humidity is"
            + humidity);
  }
}