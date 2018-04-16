package datastructures.arraymanipulation;

public class ArrayOperation {
    public int startIndex, endIndex, valueToAdd;

    /**
     * the operation will involve the data at the index startIndexOneBased, til the one at index
     * endIndexOneBasedIncluded included. The valueToAdd will be added
     * @param startIndexOneBased
     * @param endIndexOneBasedIncluded
     * @param valueToAdd
     */
    public ArrayOperation(int startIndexOneBased, int endIndexOneBasedIncluded, int valueToAdd) {
        this.startIndex = startIndexOneBased-1;
        this.endIndex = endIndexOneBasedIncluded;
        this.valueToAdd = valueToAdd;
    }
}
