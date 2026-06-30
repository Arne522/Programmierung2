package designPatterns.observer.weatherStation.live;

public class ForecastDisplay implements Observer, DisplayElement{
    private double temperatureOld;
    private double humidityOld;
    private double pressureOld;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.temperatureOld = weatherData.getTemperature();
        this.humidityOld = weatherData.getHumidity();
        this.pressureOld = weatherData.getPressure();
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public double getTemperatureOld() {
        return temperatureOld;
    }

    public void setTemperatureOld(double temperatureOld) {
        this.temperatureOld = temperatureOld;
    }

    public double getHumidityOld() {
        return humidityOld;
    }

    public void setHumidityOld(double humidityOld) {
        this.humidityOld = humidityOld;
    }

    public double getPressureOld() {
        return pressureOld;
    }

    public void setPressureOld(double pressureOld) {
        this.pressureOld = pressureOld;
    }
    @Override
    public void display() {
        System.out.println("Hello from ForecastDisplay");
    }

    @Override
    public void update() {
        System.out.println("\n");
        if(this.temperatureOld == weatherData.getTemperature() && this.humidityOld == weatherData.getHumidity() && pressureOld == weatherData.pressure){
            System.out.println("es bleibt gleich");
            return;
        }
        if(this.temperatureOld < weatherData.temperature){
            System.out.println("es wird wärmer");
        }else if(this.temperatureOld > weatherData.temperature){
            System.out.println("es wird kälter");
        }
        if(this.humidityOld < weatherData.getHumidity()){
            System.out.println("Höhere Luftfeuchtigkeit");
        }else if(this.humidityOld > weatherData.getHumidity()){
            System.out.println("Niedriegere Luftfeuchtigkeit");
        }
        if(this.pressureOld < weatherData.getPressure()){
            System.out.println("Das Wetter wird besser");
        }else if(this.pressureOld > weatherData.getPressure()){
            System.out.println("Das Wetter wird schlechter");
        }
        this.temperatureOld = weatherData.getTemperature();
        this.humidityOld = weatherData.getHumidity();
        this.pressureOld = weatherData.pressure;
    }
}
