package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

class SudokuRow {
    private final List<SudokuElement> sudokuElements = new ArrayList<>();

    SudokuRow() {
        for (int i = 0; i < 9; i++) {
            this.sudokuElements.add(new SudokuElement());
        }
    }

    List<SudokuElement> getSudokuElements() {
        return new ArrayList<>(sudokuElements);
    }
}
