package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class SudokuRow {
    private final List<SudokuElement> sudokuElements = new ArrayList<>();

    SudokuRow() {
        for (int i = 0; i < 9; i++) {
            this.sudokuElements.add(new SudokuElement());
        }
    }
    void setElementValue(int index, int value) {
        sudokuElements.get(index).setValue(value);
        deletePossibleValueInRow(value);
    }

    Set<Integer> getElementPossibleValue(int index) {
        return sudokuElements.get(index).getPossibleValue();
    }

    private void deletePossibleValueInRow(int value) {
        for (SudokuElement element: sudokuElements) {
            element.deletePossibleValue(value);
        }
    }

    void deletePossibleValueInElement(int index, int value) {
        sudokuElements.get(index).deletePossibleValue(value);
    }

    List<SudokuElement> getSudokuElements() {
        return new ArrayList<>(sudokuElements);
    }
}
