public class ObjektgroesseStrategie
        implements BeitragsStrategie {

    @Override
    public double berechneZuschlag(Unternehmen u) {

        switch (u.getObjektgroesse()) {
            case KLEIN:
                return 50;
            case MITTEL:
                return 100;
            case GROSS:
                return 200;
        }

        return 0;
    }
}
