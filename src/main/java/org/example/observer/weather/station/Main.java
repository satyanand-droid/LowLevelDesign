package org.example.observer.weather.station;

public class Main {
  public static void main(String[] args) {

    WeatherData weatherData = new WeatherData();
    Observer currentCondition = new CurrentConditions(weatherData);
    Observer weatherForecast = new WeatherForecast(weatherData);
    weatherData.setMeasurements(10, 20, 30);
    weatherData.measurementChanged();
  }
}
