package org.dreamlab.pattern.observer;

public class WeatherStationTestDrive {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        new CurrentWeatherDisplayer(station);
        new ForecastWeatherDisplayer(station);
        station.setMessurements();
    }
    
}
