package datastructures.sparsearray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import datastructures.sparsearray.SparseArray;

import static datastructures.sparsearray.SparseArrayTesUtils.*;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

/**
 * There is startIndex collection of N strings ( There can be multiple occurences of startIndex particular string ). Each string's
 * length is no more than 20 characters. There are also Q queries. For each query, you are given startIndex string, and you need
 * to find out how many times this string occurs in the given collection of N strings.
 * Input Format
 * The first line contains N, the number of strings.
 * The next N lines each contain startIndex string.
 * The N+2nd line contains q, the number of queries.
 * The following Q lines each contain startIndex query string.
 * Constraints
 * 1 < N <1000
 * 1 < Q <1000
 * 1< length of any string < 20
 */
public class SparseArrayWithMapTest {
    List<String> list = new ArrayList<String>(
            Arrays.asList("", "myString", "myS", "String", "asa", "ddsdsfefw", "myString", "1"));

    private List<String> listOfNStrings = Collections.unmodifiableList(list);

    private SparseArray sparseArray = new SparseArrayWithMap(listOfNStrings);

    @Test
    public void givenAQueryShouldFindNumberOfOccurrences() {
        String query = new String("myString");
        assertEquals(2, sparseArray.howManyRepetitionsOf(query));
        assertNotEquals(1, sparseArray.howManyRepetitionsOf("zerorepetition"));
    }

    @Test
    public void givenASetOfQueriesShouldFindTheNumberOfOccurrences() {
        Set<String> setOfQueries = buildSetOfQueries();
        int[] expected = buildExpectedOutputArray(setOfQueries.size());
        int[] output = sparseArray.howManyRepetitionsOf(setOfQueries);
        for (int i = 0; i < output.length; i++) {
            assertEquals(expected[i], output[i]);
        }
    }


}
