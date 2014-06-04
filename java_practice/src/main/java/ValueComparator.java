import java.util.Comparator;
import java.util.Map;

/**
 * Created by mbonesko on 6/2/14.
 */
class ValueComparator implements Comparator<Character> {

    Map<Character, Integer> base;
    public ValueComparator(Map<Character, Integer> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.
    public int compare(Character a, Character b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}