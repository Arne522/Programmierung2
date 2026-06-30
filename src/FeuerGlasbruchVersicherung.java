import java.util.List;

public class FeuerGlasbruchVersicherung {

    private double grundpreis;

    private List<BeitragsStrategie> strategien;

    public FeuerGlasbruchVersicherung(
            double grundpreis,
            List<BeitragsStrategie> strategien) {

        this.grundpreis = grundpreis;
        this.strategien = strategien;
    }

    public double berechneBeitrag(
            Unternehmen unternehmen) {

        double beitrag = grundpreis;

        for(BeitragsStrategie strategie : strategien) {
            beitrag += strategie.berechneZuschlag(
                    unternehmen);
        }

        return beitrag;
    }
}
