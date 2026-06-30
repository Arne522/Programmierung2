public class Expresso extends Beverage{
    double cost = 1.25;
    public Expresso( boolean mocha, boolean milk, boolean soy, boolean whip) {
        super( mocha, milk, soy, whip);
        description = "Expresso" + super.description;
    }
    @Override
    public double cost() {
        return cost+ super.cost();
    }
}
