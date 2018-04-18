package datastructures.arrays.twodarraysds;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TwoDArraysDSTest {

  TwoDArraysDS twoDArraysDS;

  int[][] arrayTwoD = new int[6][6];

  @Before
  public void setup() {
    twoDArraysDS = new TwoDArraysDS();
    fill(arrayTwoD);
  }

  private void fill(int[][] arrayTwoD) {
    List<String> rowOfIntegers = getRowsOfIntegers();
    int indexOfRow = 0;
    for (String row : rowOfIntegers) {
      fillEachColumnOfARow(arrayTwoD, indexOfRow++, row);
    }
  }

  //Note: the elements can all be negative
  private List<String> getRowsOfIntegers() {
    List<String> rowsOfIntegers = new ArrayList<String>();
    rowsOfIntegers.add("1 1 1 0 0 0");
    rowsOfIntegers.add("0 1 0 0 0 0");
    rowsOfIntegers.add("1 1 1 0 0 0");
    rowsOfIntegers.add("0 0 2 4 4 0");
    rowsOfIntegers.add("0 0 0 2 0 0");
    rowsOfIntegers.add("0 0 1 2 4 0");
    return rowsOfIntegers;
  }




  private void fillEachColumnOfARow(int[][] arrayTwoD, int indexOfRow, String targetLine) {
    int indexOfColumn = 0;
    for (String targetIntAsString : targetLine.split(" ")) {
      arrayTwoD[indexOfRow][indexOfColumn]=Integer.parseInt(targetIntAsString);
      indexOfColumn++;
    }
    indexOfColumn++;
  }

  @Test
  public void shouldReturnTheMaximumHourGlassSum() {
    assertEquals(19, twoDArraysDS.execute(arrayTwoD));
  }
}
