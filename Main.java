package ProgrammierungII.designPatterns.singleton;

public class Main {
    static void main() {
        ChocolateBoilerStart chocolateBoilerStart = ChocolateBoilerStart.getInstance();
        ChocolateBoilerStart chocolateBoilerStart2 = ChocolateBoilerStart.getInstance();
        System.out.println(chocolateBoilerStart.equals(chocolateBoilerStart2));

        ChocolateBoiler boiler = ChocolateBoiler.UNIQUE_INSTANCE;

        boiler.fill();
        boiler.boil();
        boiler.drain();

        System.out.println(boiler.isEmpty());
    }
}
