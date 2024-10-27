package org.example.observer.weather.station;

public interface State {
    public void register(Observer o);
    public void remove(Observer o);
    public void notifyObserver();
}
