public class Oregano extends PizzaDecorator {
    public Oregano(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Oregano";
    }
    public double getPrice() {
        return pizza.getPrice() + 0.5;
    }
}
