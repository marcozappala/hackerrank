package datastructures.arrays.arraymanipulation;

public class Operation {
    public int startIndex, endIndex, valueToAdd;

    /**
     * the operation will involve the data at the index startIndexOneBased, til the one at index
     * endIndexOneBased included. The valueToAdd will be added
     * @param startIndexOneBased
     * @param endIndexOneBased
     * @param valueToAdd
     */
    public Operation(int startIndexOneBased, int endIndexOneBased, int valueToAdd) {
        this.startIndex = startIndexOneBased-1;
        this.endIndex = endIndexOneBased-1;
        this.valueToAdd = valueToAdd;
    }
}
