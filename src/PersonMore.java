import java.util.Calendar;

public class PersonMore extends Person {
    private int alter;
    private String wohnort;
    public PersonMore(String name, Calendar geburtstag, int alter, String wohnort) {
        super(name, geburtstag);
        this.alter = alter;
        this.wohnort = wohnort;
    }

    public int getAlter() {
        return alter;
    }

    public String getWohnort() {
        return wohnort;
    }

    @Override
    public String toString() {return ("Name " + getName() + " ,Alter " + alter + " ,Wohnort " + wohnort + " ,Geburtsjahr " + getGeburtstag().get(Calendar.YEAR));}
}
