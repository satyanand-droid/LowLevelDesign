package org.example.observer.weatherstation;

public interface Observer {
  public void update(int temperature, int pressure, int humidity);
}
