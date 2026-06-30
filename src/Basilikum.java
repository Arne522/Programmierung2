public class Basilikum extends PizzaDecorator {
    public Basilikum(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Basilikum";
    }
    public double getPrice() {
        return pizza.getPrice() + 0.5;
    }
}
