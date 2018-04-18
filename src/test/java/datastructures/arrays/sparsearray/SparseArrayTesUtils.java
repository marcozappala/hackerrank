package datastructures.arrays.sparsearray;

import java.util.HashSet;
import java.util.Set;

public class SparseArrayTesUtils {
    private SparseArrayTesUtils() {}

    public static int[] buildExpectedOutputArray(int size) {
        int[] output = new int[size];
        output[0] = 2;
        output[1] = 1;
        output[2] = 0;
        return output;
    }

    public static Set<String> buildSetOfQueries() {
        Set<String> setOfQueries = new HashSet<>();
        setOfQueries.add("myString");
        setOfQueries.add("asa");
        setOfQueries.add("mySt");
        return setOfQueries;
    }
}
