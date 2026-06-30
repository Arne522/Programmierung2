public class Calzone extends PizzaDecorator {
    public Calzone(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + " (as Calzone)";
    }

    public double getPrice() {
        return pizza.getPrice() + 2.5;
    }
}
