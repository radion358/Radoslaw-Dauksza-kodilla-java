package com.kodilla.sudoku;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class SudokuElement implements Cloneable {
    static final int EMPTY = -1;
    private int value = EMPTY;
    private Set<Integer> possibleValue = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

    public SudokuElement deepCopy() throws CloneNotSupportedException {
        SudokuElement copyOfSudokuElement = (SudokuElement)super.clone();
        copyOfSudokuElement.possibleValue = new HashSet<>();
        copyOfSudokuElement.possibleValue.addAll(possibleValue);
        return copyOfSudokuElement;
    }
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
        this.value = value;
    }
}
