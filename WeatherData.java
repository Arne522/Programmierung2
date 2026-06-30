package designPatterns.observer.weatherStation.live;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    double temperature;
    double humidity;
    double pressure;

    List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public WeatherData(double temperature, double humidity, double pressure) {
        this.observers = new ArrayList<>();
        setMeasurements(temperature, humidity, pressure);
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach((o    ) -> o.update());
    }
}
