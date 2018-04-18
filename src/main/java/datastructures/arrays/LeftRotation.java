package datastructures.arrays;

public class LeftRotation {
  public LeftRotation(int[] array, int numberOfRotations) {
  }

  public void printArray(int[] rotatedArray) {
    for (int i=0; i< rotatedArray.length - 1; i++) {
      System.out.print(rotatedArray[i] + " ");
    }
    System.out.print(rotatedArray[rotatedArray.length-1]);
  }

  public int[] rotateTheArrayOfOne(int[] array) {
    int support = array[0];

    moveLeft(array, 1);
    array[array.length -1] = support;

    return array;
  }

  public int[] rotateArray(int[] array, int rotations) {
    int numberOfRealRotations = rotations % array.length;
    int indexOfFirstElementToMoveLeft = numberOfRealRotations;
    int indexOfFirstPositionFreed = array.length - numberOfRealRotations;
    if (numberOfRealRotations == 0) {
      return array;
    }

    int[] elementsToPostpone = saveTheElementsToReassign(array, numberOfRealRotations);
    moveLeft(array, indexOfFirstElementToMoveLeft);
    reAssignSavedElements(array, indexOfFirstPositionFreed, elementsToPostpone);

    return array;
  }

  private void reAssignSavedElements(int[] array, int indexOfFirstPositionFreed, int[] elementsToPostpone) {
    for (int i=indexOfFirstPositionFreed, j=0; i < array.length && j<elementsToPostpone.length; i++, j++) {
      array[i] = elementsToPostpone[j];
    }
  }

  private void moveLeft(int[] array, int indexOfFirstElementToMoveLeft) {
    for (int i=indexOfFirstElementToMoveLeft; i < array.length; i++) {
      array[i-indexOfFirstElementToMoveLeft] = array[i];
    }
  }

  private int[] saveTheElementsToReassign(int[] array, int numberOfElementsToPostpone) {
    int[] support = new int[numberOfElementsToPostpone];

    for (int i = 0; i< numberOfElementsToPostpone; i++) {
      support[i] = array[i];
    }
    return support;
  }
}
