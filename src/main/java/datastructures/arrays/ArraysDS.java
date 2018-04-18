package datastructures.arrays;

import java.io.IOException;
import java.util.Scanner;

public class ArraysDS {

    static int[] reverseArray(int[] a) {
        int lengthOfTheArray = a.length;
        if (lengthOfTheArray == 0 || lengthOfTheArray == 1) {
            return a;
        }

        int maxIndex = lengthOfTheArray - 1;
        int ascendingIndex = 0;
        int descendingIndex = maxIndex;

        int swappingSupport = 0;
        while (ascendingIndex < descendingIndex) {
            swapElements(a, ascendingIndex, descendingIndex);
            ascendingIndex++;
            descendingIndex--;

        }
        return a;

    }

    private static void swapElements(int[] a, int ascendingIndex, int descendingIndex) {
        int swappingSupport;
        swappingSupport = a[ascendingIndex];
        a[ascendingIndex] = a[descendingIndex];
        a[descendingIndex] = swappingSupport;
    }

    public static int[] execute(String[] args) throws IOException {

        int[] arrayToReverse = getArrayToReverse(args);

        int[] res = reverseArray(arrayToReverse);

        return res;
    }

    public static int[] getArrayToReverse(String[] args) {
        int[] arrayToReverse = new int[Integer.parseInt(args[0])];
        String[] arrayOfStrings = args[1].split(" ");
        for (int arrItr = 0; arrItr < arrayOfStrings.length; arrItr++) {
            arrayToReverse[arrItr] = Integer.parseInt(arrayOfStrings[arrItr]);
        }
        return arrayToReverse;
    }

}
