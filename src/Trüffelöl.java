public class Trüffelöl extends PizzaDecorator {
    public Trüffelöl(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Trüffelöl";
    }
    public double getPrice() {
        return pizza.getPrice() + 1.2;
    }
}
