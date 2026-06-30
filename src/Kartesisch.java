public class Kartesisch implements Koordinaten{
    public double x;
    public double y;

    public Kartesisch(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void display() {
        System.out.println("x: " + x + "\ny: " + y);
    }
}
