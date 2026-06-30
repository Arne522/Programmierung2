public class Knoblauchöl extends PizzaDecorator {
    public Knoblauchöl(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Knoblauchöl";
    }
    public double getPrice() {
        return pizza.getPrice() + 1.2;
    }
}