package FlyBehavior;

public class NoFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bleibt am Boden.");
    }

    @Override
    public void abheben() {
            System.out.println("Bleibt am Boden.");
    }

    @Override
    public void kurshalten() {
            System.out.println("Bleibt am Boden.");
    }

    @Override
    public void landen() {
            System.out.println("Bleibt am Boden.");
        }
}
