import FlyBehavior.Fly;
import FlyBehavior.Flyable;
import QuackBehavior.Quack;
import QuackBehavior.Quackable;
import SwimBehavior.Swim;
import SwimBehavior.Swimable;

public class OtherDuck extends Duck {

    private final Flyable Flugverhalten = new Fly();
    private final Swimable Schwimmverhalten = new Swim();
    private final Quackable Quackverhalten = new Quack();

    @Override
    void display() {
        System.out.println("Looks like some other Duck.");
    }

    public void Flugverhalten() {
        Flugverhalten.fly();
        setFlyBehavior(Flugverhalten);
    }

    public void Schwimmverhalten() {
        Schwimmverhalten.swim();
    }

    public void Quackverhalten() {
        Quackverhalten.quack();
        setQuackBehavior(Quackverhalten);
    }
}
