package org.example.observer.weather.station;

public interface Observer {
  public void update(int temperature, int pressure, int humidity);
}
