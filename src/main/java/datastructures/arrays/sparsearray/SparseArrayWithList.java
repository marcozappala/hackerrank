package datastructures.arrays.sparsearray;

import java.util.List;

public class SparseArrayWithList extends SparseArray{
    private List<String> listOfStrings;

    public SparseArrayWithList(List<String> listOfNStrings) {
        super(listOfNStrings);
        this.listOfStrings = listOfNStrings;

    }

    @Override
    public int howManyRepetitionsOf(String query) {
        int repetitions = 0;
        for (String s : listOfStrings) {
            if (query.equals(s)) {
                repetitions++;
            }
        }
        return repetitions;
    }

}
