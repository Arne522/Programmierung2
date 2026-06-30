import FlyBehavior.Flyable;
import FlyBehavior.NoFly;
import QuackBehavior.Quackable;
import QuackBehavior.Squeak;
import SwimBehavior.Float;
import SwimBehavior.Swimable;

public class RubberDuck extends Duck {

    private final Flyable Flugverhalten = new NoFly();
    private final Swimable Schwimmverhalten = new Float();
    private final Quackable Quackverhalten = new Squeak();


    @Override
    void display() {
        System.out.println("Gummi, gelb");
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
