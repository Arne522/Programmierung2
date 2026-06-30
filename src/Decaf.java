public class Decaf extends Beverage {
    double cost = 1.5;
    public Decaf(boolean mocha, boolean milk, boolean soy, boolean whip) {
        super(mocha, milk, soy, whip);
        description = "Decaf" + super.description;
    }
    @Override
    public double cost() {
        return cost + super.cost();
    }

}


