package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = numbersExterminator.exterminate(new ArrayList<Integer>());
        List<Integer> expected = new ArrayList<Integer>();
        System.out.println("Testing empty list case");
        //Then
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = numbersExterminator.exterminate(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 4, 6));
        System.out.println("Testing normal list case");
        //Then
        Assert.assertEquals(expected, result);

    }
}
