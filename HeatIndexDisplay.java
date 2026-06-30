package designPatterns.observer.weatherStation.live;

public class HeatIndexDisplay implements DisplayElement, Observer{

    private WeatherData weatherData;



    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    private double computeHeatIndex(double t, double rh)     {
        double c1, c2, c3, c4, c5, c6, c7, c8, c9, index;
        c1 = -8.784695;
        c2 = 1.61139411;
        c3 = 2.338549;
        c4 = -0.14611605;
        c5 = -0.012308094;
        c6 = -0.016425828;
        c7 = 0.002211732;
        c8 = 0.00072546;
        c9 = -0.000003582;
        index = c1 + c2 * t + c3 * rh + c4 * t * rh + c5 * t * t + c6 * rh * rh + c7 * t * t * rh + c8 * t * rh * rh + c9 * t * t * rh * rh;
        return index;
    }
    @Override
    public void display() {
        System.out.println("Hello from HeatIndexDisplay");
    }

    @Override
    public void update() {
        System.out.println("\nTemperature: " + weatherData.getTemperature() +"\nHumidity: " + weatherData.getHumidity() + "\nPressure: " + weatherData.getPressure());
        System.out.println("Heatindex: " + computeHeatIndex(weatherData.getTemperature(), weatherData.getHumidity()));
    }
}
