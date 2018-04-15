package datastructures;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import datastructures.ArraysDS;

import static junit.framework.TestCase.*;

@RunWith(MockitoJUnitRunner.class)
public class ArraysDSTest {

    @Test
    public void returnSameArrayIfLessThanTwoElements(){
        String[] inputsForSingleElementArray = new String[2];
        inputsForSingleElementArray[0] = "1";
        inputsForSingleElementArray[1] = "3";

        try {
            int[] reversedArray = ArraysDS.execute(inputsForSingleElementArray);
            assertTrue(reversedArray[0] == Integer.parseInt(inputsForSingleElementArray[1]));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void returnReversedArrayIfSizeHigherThanOneAndEven(){
        String[] inputsForMultipleAndEvenelemnts = new String[2];
        inputsForMultipleAndEvenelemnts[0] = "4";
        inputsForMultipleAndEvenelemnts[1] = "1 2 3 4";

        reverseAndVerify(inputsForMultipleAndEvenelemnts);

    }

    @Test
    public void returnReversedArrayIfSizeHigherThanOneAndOdd(){
        String[] inputsForMultpleAndOddElements = new String[2];
        inputsForMultpleAndOddElements[0] = "5";
        inputsForMultpleAndOddElements[1] = "1 2 3 4 5";

        reverseAndVerify(inputsForMultpleAndOddElements);

    }

    private void reverseAndVerify(String[] inputsForMultpleAndOddElements) {
        try {
            int[] reversedArray = ArraysDS.execute(inputsForMultpleAndOddElements);
            int[] arrayToReverse = ArraysDS.getArrayToReverse(inputsForMultpleAndOddElements);
            int ascendingIndex = 0;
            int descendingIndex = reversedArray.length - 1;

            while(ascendingIndex < descendingIndex) {
                assertEquals(reversedArray[ascendingIndex], arrayToReverse[descendingIndex]);
                ascendingIndex++;
                descendingIndex--;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
