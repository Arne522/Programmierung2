public abstract class Beverage {
    protected String description;
    protected double price;

    public double cost(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    @Override
    public String toString(){
        return "Description: " + getDescription() + "\nPrice: " + cost();
    }
}
