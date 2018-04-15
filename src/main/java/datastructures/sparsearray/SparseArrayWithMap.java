package datastructures.sparsearray;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SparseArrayWithMap extends SparseArray{
    private Map<String, Integer> mapOfOccurrences = new HashMap<>();

    public SparseArrayWithMap(List<String> listOfStrings) {
        super(listOfStrings);
        listOfStrings.forEach(s -> insertOrIncrementInMap(s));
    }

    public void insertOrIncrementInMap(String string) {
        if (mapOfOccurrences.computeIfPresent(string, (key, value) -> value+1) == null) {
            mapOfOccurrences.putIfAbsent(string, 1);
        }
    }

    @Override
    public int howManyRepetitionsOf(String query) {
        Integer repetitions = mapOfOccurrences.get(query);
        return repetitions == null ? 0 : repetitions;
    }

}
