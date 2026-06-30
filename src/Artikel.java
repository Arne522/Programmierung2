public class Artikel {
    private int artikelnummer;
    private double preis;
    private String warengruppe;
    private int lagerbestand;

    public Artikel(int artikelnummer, double preis, String warengruppe, int lagerbestand) {
        this.artikelnummer = artikelnummer;
        this.preis = preis;
        this.warengruppe = warengruppe;
        this.lagerbestand = lagerbestand;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public double getPreis() {
        return preis;
    }

    public String getWarengruppe() {
        return warengruppe;
    }

    public int getLagerbestand() {
        return lagerbestand;
    }

    @Override
    public String toString() {
        return ("Artikelnummer: " + artikelnummer + ", preis: " + preis + ", warengruppe: " + warengruppe +  ", lagerbestand: " + lagerbestand);
    }
}
