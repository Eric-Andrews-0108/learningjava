package org.dreamlab.pattern.observer;

public class ForecastWeatherDisplayer implements Observer, Displayer {
    private Subject subject;
    private double humidity;

    ForecastWeatherDisplayer(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Humidity is : " + this.humidity + "%");
        
    }

    @Override
    public void update() {
        if (subject instanceof WeatherStation) {
            WeatherStation station = (WeatherStation) subject;
            humidity = station.getHumidity();
           
        }
        display();

    }
    
    
}
