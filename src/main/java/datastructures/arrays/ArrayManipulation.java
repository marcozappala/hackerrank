package datastructures.arrays;

import java.util.List;

import datastructures.arrays.arraymanipulation.Operation;

public class ArrayManipulation {
    private int[] data;
    private int max=0;
    public ArrayManipulation(int[] data) {
        this.data=data;
    }

    public void performOperation(Operation firstOperation) {
        for (int i = firstOperation.startIndex; i <= firstOperation.endIndex; i++) {
            data[i] = data[i] + firstOperation.valueToAdd;
            if (data[i] > max) {
                max = data[i];
            }
        }

    }

    public int getMax() {
        return max;
    }

    public void performOperations(List<Operation> operations) {
        for (Operation operation: operations) {
            performOperation(operation);
        }
    }
}
