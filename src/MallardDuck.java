import QuackBehavior.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable,Swimable{
    @Override
    public void display() {
        System.out.println("looks like a mallard");
    }

    @Override
    public void fly() {
        System.out.println("Flap Flap");
    }

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }

    @Override
    public void swim(){
        System.out.println("Splash Splash");
    }
}
