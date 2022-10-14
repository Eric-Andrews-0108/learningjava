package org.dreamlab.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private double temperature;
    private double humidity;

    WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
        
    }

    @Override
    public void removeObserver(Observer o) {
       observers.remove(o);
    }
    
    public double fetchTemperature() {
        return Math.random() * 20 + 10;
    }

    public double fetchHumidity() {
        return Math.random() * 30 + 70;
    }

    public void setMessurements() {
        this.temperature = fetchTemperature();
        this.humidity = fetchHumidity();
        notifyObservers();
    }

    public double getHumidity() {
        return humidity;
    }

    public double getTemperature() {
        return temperature;
    }
    
}
