import java.util.ArrayList;
import java.util.List;

public class Bank implements Subject{
    private List<Observer> observerList = new ArrayList<Observer>();
    private String aktion;

    public String getAktion() {
        return aktion;
    }

    public void setAktion(String aktion) {
        this.aktion = aktion;
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
        for(Observer observer: observerList){
            observer.update();
        }
    }
}
