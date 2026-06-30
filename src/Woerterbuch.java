import java.util.*;

public class Woerterbuch {

    private Map<String, String> map = new HashMap<>();

    public void einfuegen(String deutsch, String englisch) {
        map.put(deutsch, englisch);
    }

    public String toString() {
        return map.toString();
    }

    public String uebersetzen(String deutsch) {
        return map.get(deutsch);
    }

    public List<String> deutscheWoerterSortiert() {
        List<String> liste = new ArrayList<>(map.keySet());
        Collections.sort(liste);
        return liste;
    }

    public Collection<String> englischeWoerter() {
        return map.values();
    }

    public List<String> englischeWoerterSortiert() {
        List<String> liste = new ArrayList<>(map.values());
        Collections.sort(liste);
        return liste;
    }
}
