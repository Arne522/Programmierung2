public class MediumPizza implements Pizza {
    @Override
    public String getDescription() {
        return "MediumPizza";
    }

    @Override
    public double getPrice() {
        return 6.0;
    }
}
