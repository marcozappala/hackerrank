package datastructures.arrays;

import datastructures.arrays.arraymanipulation.ArrayOperation;

public class ArrayManipulation {
    private int[] data;
    private int max=0;
    public ArrayManipulation(int[] data) {
        this.data=data;
    }

    public void performOperation(ArrayOperation firstOperation) {
        for (int i = firstOperation.startIndex; i< firstOperation.endIndex; i++) {
            data[i] = data[i] + firstOperation.valueToAdd;
            if (data[i] > max) {
                max = data[i];
            }
        }

    }

    public int getMax() {
        return max;
    }

    public void performOperations(ArrayOperation... operations) {
        for (ArrayOperation operation: operations) {
            performOperation(operation);
        }
    }
}
