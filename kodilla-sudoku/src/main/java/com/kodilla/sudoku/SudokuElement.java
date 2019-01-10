package com.kodilla.sudoku;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class SudokuElement {
    static final int EMPTY = -1;
    private int value = EMPTY;
    private final Set<Integer> possibleValue = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

    int getValue() {
        return value;
    }

    Set<Integer> getPossibleValue() {
        return new HashSet<>(possibleValue);
    }

    void deletePossibleValue(int valueToDelete) {
        possibleValue.remove(valueToDelete);
    }

    void setValue(int value) {
        if (possibleValue.contains(value)) {
            this.value = value;
        }
    }
}
