public class Unternehmen {

    private Objektgroesse objektgroesse;
    private Lage lage;
    private Gewerbeart gewerbeart;
    private double gueterwert;

    public Unternehmen(
            Objektgroesse objektgroesse,
            Lage lage,
            Gewerbeart gewerbeart,
            double gueterwert) {

        this.objektgroesse = objektgroesse;
        this.lage = lage;
        this.gewerbeart = gewerbeart;
        this.gueterwert = gueterwert;
    }

    public Objektgroesse getObjektgroesse() {
        return objektgroesse;
    }

    public Lage getLage() {
        return lage;
    }

    public Gewerbeart getGewerbeart() {
        return gewerbeart;
    }

    public double getGueterwert() {
        return gueterwert;
    }
}