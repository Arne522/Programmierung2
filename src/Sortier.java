import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sortier extends ArrayList<String> {
    private List<String> sortier = new ArrayList<>();

    public ArrayList<String> sortAlphabet(ArrayList<String> toSort) {
        Collections.sort(toSort);
        return toSort;
    }

    public ArrayList<String> sortLength(ArrayList<String> toSort) {
        Collections.sort(toSort, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        return toSort;
    }

    public ArrayList<String> sortLetter(ArrayList<String> toSort) {
        Collections.sort(toSort, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int s1Letter = 0;
                int s2Letter = 0;
                for(int i = 0; i < s1.length(); i++){
                    char[] s1Char = s1.toCharArray();
                    if(s1Char[i] == 'e'){
                        s1Letter++;
                    }
                }
                for(int i = 0; i < s2.length(); i++){
                    char[] s2Char = s2.toCharArray();
                    if(s2Char[i] == 'e'){
                        s2Letter++;
                    }
                }
                return Integer.compare(s2Letter, s1Letter);
            }
        });
        return toSort;
    }

}
