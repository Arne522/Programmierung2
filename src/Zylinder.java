public class Zylinder implements Koordinaten{
    public double r;
    public double winkel;

    public Zylinder(double r, double winkel) {
        this.r = r;
        this.winkel = winkel;
    }

    public double getR() {
        return r;
    }

    public double getWinkel() {
        return winkel;
    }

    @Override
    public void display() {
            System.out.println("r: " + r + "\nwinkel: " + winkel);
    }
}
