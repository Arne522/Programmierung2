package SwimBehavior;

public class Sink implements Swimable{
    @Override
    public void swim() {
        System.out.println("Glug, glug!");
    }
}
