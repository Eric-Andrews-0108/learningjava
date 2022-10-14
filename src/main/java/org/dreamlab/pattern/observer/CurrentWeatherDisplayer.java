package org.dreamlab.pattern.observer;

public class CurrentWeatherDisplayer implements Observer, Displayer {

    private Subject subject;
    private double temperature;
    private double humidity;


    CurrentWeatherDisplayer(Subject s) {
        subject = s;
        s.registerObserver(this);
    }

    public void setSubject(Subject s) {
        this.subject = s;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public void update() {
        if (subject instanceof WeatherStation) {
            WeatherStation station = (WeatherStation)subject;
            temperature = station.getTemperature();
            humidity = station.getHumidity();
        }
        display();
    }
    
    @Override
    public void display() {
        System.out.println("Temerature is : " + temperature + " Humidity is: " + humidity);
    }
}
