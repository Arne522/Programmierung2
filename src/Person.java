import java.util.Calendar;

public class Person {
    private String name;
    private Calendar geburtstag;
    public Person(String name, Calendar geburtstag) {
        this.name = name;
        this.geburtstag = geburtstag;
    }

    public String getName() {
        return name;
    }


    public Calendar getGeburtstag() {
        return geburtstag;
    }
}

