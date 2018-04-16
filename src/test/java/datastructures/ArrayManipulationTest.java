package datastructures;

import org.junit.Before;
import org.junit.Test;

import datastructures.arraymanipulation.ArrayOperation;

import static junit.framework.TestCase.assertEquals;

public class ArrayManipulationTest {
    int[] data = new int[5];
    ArrayManipulation arrayManipulation = new ArrayManipulation(data);

    private ArrayOperation firstOperation;

    private ArrayOperation secondOperation;

    private ArrayOperation thirdOperation;

    @Before
    public void setup() {
        firstOperation = new ArrayOperation(1,2,100);
        secondOperation = new ArrayOperation(2,5,100);
        thirdOperation = new ArrayOperation(3,4,100);
        thirdOperation = new ArrayOperation(3,6,100);
    }

    @Test
    public void shouldPerformOperation() {
        arrayManipulation.performOperation(firstOperation);
        assertEquals(100, arrayManipulation.getMax());
    }

    @Test
    public void shouldPerformOperations() {
        arrayManipulation.performOperations(firstOperation, secondOperation, thirdOperation);
        assertEquals(200, arrayManipulation.getMax());
    }
}
