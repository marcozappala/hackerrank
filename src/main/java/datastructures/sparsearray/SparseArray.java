package datastructures.sparsearray;

import java.util.List;
import java.util.Set;

public abstract class SparseArray {

    public SparseArray(List<String> listOfNStrings) {}

    public  abstract int howManyRepetitionsOf(String query);

    public int[] howManyRepetitionsOf(Set<String> setOfQueries) {
        int[] output = new int[setOfQueries.size()];
        int i=0;
        for (String query: setOfQueries) {
            output[i] = howManyRepetitionsOf(query);
            i++;
        }
        return output;

    }
}
