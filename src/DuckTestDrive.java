
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey); // drumherum, Verpackung, Gewand

        System.out.println("Ein Truthahn macht ...");
        turkey.gobble();
        turkey.fly();

        System.out.println("Eine Ente macht ...");
        testDuck(duck);

        System.out.println("Ein Truthahn-Adapter macht ...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck d) {
        d.quack();
        d.fly();
    }
}
