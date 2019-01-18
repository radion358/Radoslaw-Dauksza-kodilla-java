package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class SudokuRow implements Cloneable {
    private List<SudokuElement> sudokuElements = new ArrayList<>();

    public SudokuRow deepCopy() throws CloneNotSupportedException {
        SudokuRow copyOfSudokuRow = (SudokuRow)super.clone();
        copyOfSudokuRow.sudokuElements = new ArrayList<>();
        for (SudokuElement element: sudokuElements) {
            copyOfSudokuRow.sudokuElements.add(element.deepCopy());
        }
        return copyOfSudokuRow;
    }

    SudokuRow() {
        for (int i = 0; i < 9; i++) {
            this.sudokuElements.add(new SudokuElement());
        }
    }
    void setElementValue(int index, int value) {
        sudokuElements.get(index).setValue(value);
    }

    Set<Integer> getElementPossibleValue(int index) {
        return sudokuElements.get(index).getPossibleValue();
    }

    void deletePossibleValueInRow(int value) {
        for (SudokuElement element: sudokuElements) {
            element.deletePossibleValue(value);
        }
    }

    void deletePossibleValueInElement(int index, int value) {
        sudokuElements.get(index).deletePossibleValue(value);
    }

    List<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }
}
