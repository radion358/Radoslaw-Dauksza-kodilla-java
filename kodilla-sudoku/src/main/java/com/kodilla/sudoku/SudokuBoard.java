package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private final List<SudokuRow> sudokuRows = new ArrayList<>();

    SudokuBoard() {
        for (int i = 0; i < 9; i++) {
            this.sudokuRows.add(new SudokuRow());
        }
    }

    void setElementValue(int columnIndex, int rowIndex, int value) {
        if (sudokuRows.get(columnIndex).getElementPossibleValue(rowIndex).contains(value)) {
            sudokuRows.get(columnIndex).setElementValue(rowIndex, value);
            deletePossibleValueInColumn(columnIndex, value);
            deletePossibleValueInBlock(columnIndex, rowIndex, value);
        }
    }

    private void deletePossibleValueInColumn(int columnIndex, int value) {
        for (SudokuRow row : sudokuRows) {
            row.deletePossibleValueInElement(columnIndex, value);
        }
    }

    private void deletePossibleValueInBlock(int columnIndex, int rowIndex, int value) {

    }

    @Override
    public String toString() {
        StringBuilder board = new StringBuilder("     1     2     3     4     5     6     7     8     9\n");
        int rowCount = 1;
        for (SudokuRow row : sudokuRows) {
            board.append("   ----- ----- ----- ----- ----- ----- ----- ----- -----\n").append(rowCount).append(" ");
            for (SudokuElement element: row.getSudokuElements()) {
                board.append("|");
                if (element.getValue() != SudokuElement.EMPTY) {
                    board.append("  ").append(element.getValue()).append("  ");
                }else  board.append("     ");
            }
            board.append("|\n");
            rowCount++;
        }
        board.append("   ----- ----- ----- ----- ----- ----- ----- ----- -----\n");
        return board.toString();
    }
}
