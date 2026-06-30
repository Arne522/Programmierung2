public class GewerbeStrategie
        implements BeitragsStrategie {

    @Override
    public double berechneZuschlag(Unternehmen u) {

        switch (u.getGewerbeart()) {

            case DIENSTLEISTUNG:
                return 50;

            case HANDEL:
                return 100;

            case GASTRONOMIE:
                return 250;

            case PRODUKTION:
                return 400;
        }

        return 0;
    }
}
