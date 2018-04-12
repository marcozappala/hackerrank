import static junit.framework.TestCase.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class LeftRotationTest {

  int[] array = new int[5];

  LeftRotation leftRotation;

  int rotations = 11;

  @Before
  public void setup() {
    fillTheArray();
    leftRotation = new LeftRotation(array, rotations);
  }

  @Test
  public void shouldPerformALeftRotationOfOne() {
    int[] rotatedArray = { 1, 2, 3, 4, 0 };
    assertTrue(theTwoArraysHaveSameContent(rotatedArray, leftRotation.rotateTheArrayOfOne(array)));

  }

  @Test
  public void shouldReturnTheArrayTotatedLeftOfTheRotationsSpecified() {
    int[] expected = { 1, 2, 3, 4, 0 };
    int [] output = leftRotation.rotateArray(array, rotations);
    assertTrue(theTwoArraysHaveSameContent(expected, output));
    leftRotation.printArray(output);
  }

  private boolean theTwoArraysHaveSameContent(int[] rotatedArray, int[] array) {
    int arrayLength = array.length;
    if (rotatedArray.length != arrayLength) {
      return false;
    }
    for (int i = 0; i < arrayLength; i++) {
      if (rotatedArray[i] != array[i]) {
        return false;
      }
    }
    return true;
  }

  private void fillTheArray() {
    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }
  }
}
