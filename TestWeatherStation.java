package designPatterns.observer.weatherStation.live;

public class TestWeatherStation {
    static void main() {
        WeatherData weatherData = new WeatherData(15.0, 61.0, 1.0);
        Observer currentConditions = new CurrentConditions(weatherData);
        Observer heatIndexDisplay = new HeatIndexDisplay(weatherData);
        Observer foreCastDisplay = new ForecastDisplay(weatherData);
        Observer statisticDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(17.3, 63.0, 0.9);
        weatherData.setMeasurements(17.3, 63.0, 0.9);
        weatherData.setMeasurements(17.6, 62.1, 0.9);
        weatherData.setMeasurements(25.6,55.1,1);
    }
}
