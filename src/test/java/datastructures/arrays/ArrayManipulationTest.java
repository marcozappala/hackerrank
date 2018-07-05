package datastructures.arrays;

import datastructures.arrays.ArrayManipulation;
import org.junit.Before;
import org.junit.Test;

import datastructures.arrays.arraymanipulation.ArrayOperation;

import static junit.framework.TestCase.assertEquals;

public class ArrayManipulationTest {
    int[] data = new int[10];
    ArrayManipulation arrayManipulation = new ArrayManipulation(data);

    private ArrayOperation firstOperation;

    private ArrayOperation secondOperation;

    private ArrayOperation thirdOperation;

    @Before
    public void setup() {
        firstOperation = new ArrayOperation(1,5,3);
        secondOperation = new ArrayOperation(4,8,7);
        thirdOperation = new ArrayOperation(6,9,1);
    }

    @Test
    public void shouldPerformOperation() {
        arrayManipulation.performOperation(firstOperation);
        assertEquals(3, arrayManipulation.getMax());
    }

    @Test
    public void shouldPerformOperations() {
        arrayManipulation.performOperations(firstOperation, secondOperation, thirdOperation);
        assertEquals(10, arrayManipulation.getMax());
    }
}
