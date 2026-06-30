public class Chiliöl extends PizzaDecorator {
    public Chiliöl(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Chiliöl";
    }
    public double getPrice() {
        return pizza.getPrice() + 1.2;
    }
}
