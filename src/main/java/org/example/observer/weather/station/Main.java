package org.example.observer.weather.station;

public class Main {
    public static void main(String[] args){
            Observer currentCondition = new CurrentConditions();
            Observer weatherForecast = new WeatherForecast();
            WeatherData weatherData = new WeatherData();
            weatherData.register(currentCondition);
            weatherData.register(weatherForecast);
            weatherData.setMeasurements(10,20,30);
            weatherData.measurementChanged();
    }
}
