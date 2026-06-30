import java.util.Calendar;

public class Termin {
    public String beschreibung;
    public String ort;
    public Calendar zeit;

    public Termin(String beschreibung, String ort, Calendar zeit) {
        this.beschreibung = beschreibung;
        this.ort = ort;
        this.zeit = zeit;
    }

    @Override
    public String toString() {
        return beschreibung + " in " + ort + " am " + zeit.getTime();
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Calendar getZeit() {
        return zeit;
    }

    public void setZeit(Calendar zeit) {
        this.zeit = zeit;
    }
}
