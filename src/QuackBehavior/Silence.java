package QuackBehavior;

public class Silence implements Quackable{
    @Override
    public void quack() {
        System.out.println("...");
    }
}
