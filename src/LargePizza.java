public class LargePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Large Pizza";
    }

    @Override
    public double getPrice() {
        return 8.0;
    }
}
