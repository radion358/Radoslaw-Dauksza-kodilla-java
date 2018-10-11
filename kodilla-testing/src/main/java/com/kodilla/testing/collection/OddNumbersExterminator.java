package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> exterminate = new ArrayList<Integer>();
        for (Integer element : numbers) {
            if ((element % 2) == 0) {
                exterminate.add(element);
            }
        }
        return exterminate;
    }
}
