public class GueterwertStrategie
        implements BeitragsStrategie {

    @Override
    public double berechneZuschlag(Unternehmen u) {

        return u.getGueterwert() * 0.005;
    }
}
