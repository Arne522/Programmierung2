import java.util.ArrayList;
import java.util.List;

public class WheaterData implements Subject{

    private List<Observer> observerList =new ArrayList<>();
    private float temp;
    private float humidity;
    private float pressure;

    public WheaterData(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyObservers();
    }



    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.notifyObservers();
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.notifyObservers();
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.notifyObservers();
        this.pressure = pressure;
    }
}
