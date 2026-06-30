import FlyBehavior.Flyable;
import FlyBehavior.NoFly;
import QuackBehavior.Quackable;
import QuackBehavior.Silence;
import SwimBehavior.Float;
import SwimBehavior.Swimable;

public class DecoyDuck extends Duck{

    private final Flyable Flugverhalten = new NoFly();
    private final Swimable Schwimmverhalten = new Float();
    private final Quackable Quackverhalten = new Silence();

    @Override
    void display() {
        System.out.println("Holzente");
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
