public class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    protected CondimentDecorator(Beverage beverage) {}

    public double cost() {
        return beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription();
    }
}
