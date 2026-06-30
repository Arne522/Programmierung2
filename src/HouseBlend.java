public class HouseBlend extends Beverage{
    double cost = 1;
    public HouseBlend( boolean mocha, boolean milk, boolean soy, boolean whip) {
        super( mocha, milk, soy, whip);
        description = "Houseblend" + super.description;
    }

    @Override
    public double cost() {
        return cost+ super.cost();
    }
}
