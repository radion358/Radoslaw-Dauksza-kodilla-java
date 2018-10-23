package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] emptyArray = {};

        //When
        double expectedAverageForNonEmptyArray = 5;
        double expectedAverageForEmptyArray = -1;
        double actualAverageForNonEmptyArray = ArrayOperations.getAverage(array);
        double actualAverageForEmptyArray = ArrayOperations.getAverage(emptyArray);

        //Then
        Assert.assertEquals(expectedAverageForNonEmptyArray, actualAverageForNonEmptyArray, 0.001);
        Assert.assertEquals(expectedAverageForEmptyArray, actualAverageForEmptyArray, 0.001 );
    }
}
