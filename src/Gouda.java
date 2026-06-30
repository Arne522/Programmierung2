public class Gouda extends PizzaDecorator {
    public Gouda(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Gouda";
    }
    public double getPrice() {
        return pizza.getPrice() + 1.0;
    }
}
