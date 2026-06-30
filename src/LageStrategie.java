public class LageStrategie
        implements BeitragsStrategie {

    @Override
    public double berechneZuschlag(Unternehmen u) {

        switch (u.getLage()) {

            case LAND:
                return 20;

            case VORSTADT:
                return 50;

            case INNENSTADT:
                return 120;

            case INDUSTRIEGEBIET:
                return 180;
        }

        return 0;
    }
}
