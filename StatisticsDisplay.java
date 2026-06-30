package designPatterns.observer.weatherStation.live;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement {
    private ArrayList<Double> temperature =  new ArrayList<>();
    private ArrayList<Double> humidity =  new ArrayList<>();
    private ArrayList<Double> pressure =  new ArrayList<>();
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        temperature.add(weatherData.temperature);
        humidity.add(weatherData.humidity);
        pressure.add(weatherData.pressure);
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println();
        this.temperature.add(weatherData.getTemperature());
        this.humidity.add(weatherData.getHumidity());
        this.pressure.add(weatherData.getPressure());
        System.out.println("Temperaturverlauf: ");
        this.temperature.forEach(System.out::println);
        System.out.println();
        System.out.println("Luftfeuchtigkeitsverlauf");
        this.humidity.forEach(System.out::println);
        System.out.println();
        System.out.println("Luftdrucksverlauf");
        this.pressure.forEach(System.out::println);
    }

    @Override
    public void display() {
        System.out.println("Hello from StatisticsDisplay");
    }
}
