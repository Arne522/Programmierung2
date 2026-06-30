public class Mozzarella  extends PizzaDecorator{
    public Mozzarella(Pizza pizza) {
        super(pizza);
    }
    public String getDescription(){
        return  pizza.getDescription() + ", Mozzarella";
    }

    public double getPrice(){
        return  pizza.getPrice() + 1.0;
    }
}
