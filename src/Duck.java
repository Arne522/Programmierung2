import FlyBehavior.Flyable;
import QuackBehavior.Quackable;

public abstract class Duck{
    protected Flyable flyBehavior;
    protected Quackable quackBehavior;

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    // Verhalten zur Laufzeit ändern
    public void setFlyBehavior(Flyable fb) {
        this.flyBehavior = fb;
    }

    public void abheben() {
        flyBehavior.abheben();
    }

    public void kurshalten() {
        flyBehavior.kurshalten();
    }

    public void landen() {
        flyBehavior.landen();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    // Verhalten zur Laufzeit ändern
    public void setQuackBehavior(Quackable qb) {
        this.quackBehavior = qb;
    }

}