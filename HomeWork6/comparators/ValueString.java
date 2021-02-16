package HomeWork6.comparators;

import java.util.Comparator;
import java.util.Map;

public class ValueString implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry o1, Map.Entry o2) {
        return ((Integer) o2.getValue()).compareTo((Integer) o1.getValue());
    }
}
