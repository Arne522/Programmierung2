public class Parmesan extends PizzaDecorator {
    public Parmesan(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Parmesan";
    }
    public double getPrice() {
        return pizza.getPrice() + 1.5;
    }
}