package FlyBehavior;

public class Rocket implements Flyable{
    @Override
    public void fly() {
        System.out.println("Ich fliege mit Raketenantrieb!");
    }

    @Override
    public void abheben() {
        System.out.println("Start mit Raketenantrieb!");
    }

    @Override
    public void kurshalten() {
        System.out.println("auf Kurs");
    }

    @Override
    public void landen() {
        System.out.println("Landung am Boden");
    }
}
