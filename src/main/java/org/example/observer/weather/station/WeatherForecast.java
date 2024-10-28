package org.example.observer.weather.station;

public class WeatherForecast implements Observer {
    private State WeatherData;

    public WeatherForecast(State weatherData){
        this.WeatherData=weatherData;
        weatherData.register(this);
    }
    @Override
    public void update(int temperature, int pressure, int humidity) {
    System.out.println("inside weather forecast ");
    System.out.println(
                "current conditions, temperature is "
                        + temperature
                        + "pressure "
                        + pressure
                        + " and humidity is"
                        + humidity);
    }
    }

