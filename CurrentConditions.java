package designPatterns.observer.weatherStation.live;

public class CurrentConditions implements DisplayElement, Observer {

    private WeatherData weatherData;

    public CurrentConditions(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Hello from CurrentConditions");
    }

    @Override
    public void update() {
        System.out.println("\nTemperature: " + weatherData.getTemperature() +"\nHumidity: " + weatherData.getHumidity() + "\nPressure: " + weatherData.getPressure());
    }
}
