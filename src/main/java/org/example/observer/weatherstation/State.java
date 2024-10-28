package org.example.observer.weatherstation;

public interface State {
  public void register(Observer o);

  public void remove(Observer o);

  public void notifyObserver();
}
