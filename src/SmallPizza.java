public class SmallPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Small Pizza";
    }

    @Override
    public double getPrice() {
        return 4.0;
    }
}
