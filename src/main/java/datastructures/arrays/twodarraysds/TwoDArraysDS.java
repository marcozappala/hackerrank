package datastructures.arrays.twodarraysds;

public class TwoDArraysDS {

  public int execute(int[][] matrix) {
    int heightOfHourGlass = 3;
    int widthOfHourGlass = 3;

    int maxTopLeftYIndex = matrix.length - (heightOfHourGlass - 1);
    int maxTopLeftXIndex = matrix[matrix.length - 1].length - (widthOfHourGlass - 1);

    if (indexesAreNotValid(maxTopLeftYIndex, maxTopLeftXIndex))
      return 0;

    return calculateMaximum(matrix, maxTopLeftYIndex, maxTopLeftXIndex);

  }

  private boolean indexesAreNotValid(int maxTopLeftXIndex, int maxTopLeftYIndex) {
    if (maxTopLeftXIndex < 0 || maxTopLeftYIndex < 0) {
      return true;
    }
    return false;
  }

  private int calculateMaximum(int[][] matrix, int maxTopLeftYIndex, int maxTopLeftXIndex) {
    //Note: the elements can all be negative. The minimum sum, according to the input constraints, can be -9*7 = -63
    int maximumSum = -63;

    for (int row = 0; row < maxTopLeftYIndex; row++) {
      for (int col = 0; col < maxTopLeftXIndex; col++) {
        int sum = sumHourGlassWithTopLeftIndex(row, col, matrix);
        if (sum>maximumSum) maximumSum = sum;
      }
    }
    return maximumSum;
  }

  public int sumHourGlassWithTopLeftIndex(int yIndex, int xIndex, int[][] matrix) {
    int middleXIndex = xIndex + 1;
    int bottomLineYIndex = yIndex + 2;
    int topLine = matrix[yIndex][xIndex] + matrix[yIndex][middleXIndex] + matrix[yIndex][xIndex+2];
    int middleElement = matrix[yIndex+1][middleXIndex];
    int bottomLine = matrix[bottomLineYIndex][xIndex] + matrix[bottomLineYIndex][middleXIndex] + matrix[bottomLineYIndex][xIndex+2];

    return topLine+middleElement+bottomLine;
  }

}
