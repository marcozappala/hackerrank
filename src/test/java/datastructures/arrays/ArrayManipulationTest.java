package datastructures.arrays;

import static junit.framework.TestCase.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import datastructures.arrays.arraymanipulation.Operation;

@RunWith(Parameterized.class)
public class ArrayManipulationTest {

  int[] data = new int[10];

  ArrayManipulation arrayManipulation = new ArrayManipulation(data);

  private List<Operation> operations;

  @Parameterized.Parameters
  public static Collection data() {
    ArrayList<Operation> first =  new ArrayList<Operation>();
    first.add(new Operation(1, 5, 3));
    first.add(new Operation(4, 8, 5000));
    first.add(new Operation(6, 9, 1));
    first.add(new Operation(1, 5, 3));
    first.add(new Operation(1, 5, 3));
    first.add(new Operation(4, 8, -30000));
    first.add(new Operation(1, 5, 3));
    first.add(new Operation(1, 5, 3));
    first.add(new Operation(1, 5, 3));

    ArrayList<Operation> second =  new ArrayList<Operation>();
    second.add(new Operation(1, 5, 3));
    second.add(new Operation(4, 8, 7));
    second.add(new Operation(6, 9, 1));

    ArrayList<Operation> third =  new ArrayList<Operation>();
    third.add(new Operation(1, 5, 3));
    third.add(new Operation(4, 8, 7));
    third.add(new Operation(6, 9, 1));



    ArrayList<Operation>[][] prova = new ArrayList[][] {
        { first },
        { second },
        { third }
    };


    return Arrays.asList(prova);
  }

  public ArrayManipulationTest(List<Operation> operations ) {
    this.operations = operations;
  }

  @Test
  public void shouldPerformOperation() {
    arrayManipulation.performOperation(operations.get(0));
    assertEquals(3, arrayManipulation.getMax());
  }

  @Test
  public void shouldPerformOperations() {
    arrayManipulation.performOperations(operations);
    assertEquals(10, arrayManipulation.getMax());
  }

}
