public class DarkRoast extends Beverage{
    double cost = 2;
    public DarkRoast( boolean mocha, boolean milk, boolean soy, boolean whip) {
        super( mocha, milk, soy, whip);
        description = "Darkroast" + super.description;
    }
    @Override
    public double cost() {
        return cost+ super.cost();
    }
}
