package FlyBehavior;

public class Fly implements Flyable{
    @Override
    public void fly() {
        System.out.println("Flap, flap!");
    }

    @Override
    public void abheben() {
        System.out.println("Die Ente hebt ab");
    }

    @Override
    public void kurshalten() {
        System.out.println("Die Ente gleitet in der Luft");
    }

    @Override
    public void landen() {
        System.out.println("Die Ente landet");
    }
}
