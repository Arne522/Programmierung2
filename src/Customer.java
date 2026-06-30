public class Customer implements  Observer{
    private String name;
    private Bank bank;

    public Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
        bank.addObserver(this);

    }

    @Override
    public void update() {
        System.out.println(name + " der Kurs deiner Aktien " + bank.getAktion());
    }
}
