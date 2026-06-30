import java.util.Set;
import java.util.TreeSet;

public class Lotto {
    public TreeSet<Integer> Lottozahlen(){
        TreeSet<Integer> zahlen = new TreeSet<>();
        while (zahlen.size() < 6){
            zahlen.add((int)(Math.random()* 49)+ 1);
        }
        return  zahlen;
    }
}
