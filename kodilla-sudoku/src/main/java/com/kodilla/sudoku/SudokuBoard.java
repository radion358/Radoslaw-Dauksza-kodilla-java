package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private final List<SudokuRow> sudokuRows = new ArrayList<>();
    private final List<SudokuElement> block1 = new ArrayList<>();
    private final List<SudokuElement> block2 = new ArrayList<>();
    private final List<SudokuElement> block3 = new ArrayList<>();
    private final List<SudokuElement> block4 = new ArrayList<>();
    private final List<SudokuElement> block5 = new ArrayList<>();
    private final List<SudokuElement> block6 = new ArrayList<>();
    private final List<SudokuElement> block7 = new ArrayList<>();
    private final List<SudokuElement> block8 = new ArrayList<>();
    private final List<SudokuElement> block9 = new ArrayList<>();

    SudokuBoard() {
        for (int i = 0; i < 9; i++) {
            this.sudokuRows.add(new SudokuRow());
        }
        fillBlocks();
    }

    void setElementValue(int columnIndex, int rowIndex, int value) {
        if (sudokuRows.get(rowIndex).getElementPossibleValue(columnIndex).contains(value)) {
            try {
                deletePossibleValueInBlock(whichBlock(rowIndex, columnIndex) , value);
                deletePossibleValueInColumn(columnIndex, value);
                sudokuRows.get(rowIndex).deletePossibleValueInRow(value);
                sudokuRows.get(rowIndex).setElementValue(columnIndex, value);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    private void deletePossibleValueInColumn(int columnIndex, int value) {
        for (SudokuRow row : sudokuRows) {
            row.deletePossibleValueInElement(columnIndex, value);
        }
    }

    private void deletePossibleValueInBlock(List<SudokuElement> block, int valueToDelete) {
        for (SudokuElement element: block) {
            element.deletePossibleValue(valueToDelete);
        }
    }

    private void fillBlocks() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                block1.add(sudokuRows.get(x).getSudokuElements().get(y));
            }
        }
        for (int x = 3; x < 6; x++) {
            for (int y = 0; y < 3; y++) {
                block2.add(sudokuRows.get(x).getSudokuElements().get(y));
            }
        }
        for (int x = 6; x < 9; x++) {
            for (int y = 0; y < 3; y++) {
                block3.add(sudokuRows.get(x).getSudokuElements().get(y));
            }
        }
        for (int x = 0; x < 3; x++) {
            for (int y = 3; y < 6; y++) {
                block4.add(sudokuRows.get(x).getSudokuElements().get(y));
            }
        }
        for (int x = 3; x < 6; x++) {
            for (int y = 3; y < 6; y++) {
                block5.add(sudokuRows.get(x).getSudokuElements().get(y));
            }
        }
        for (int x = 6; x < 9; x++) {
            for (int y = 3; y < 6; y++) {
                block6.add(sudokuRows.get(x).getSudokuElements().get(y));
            }
        }
        for (int x = 0; x < 3; x++) {
            for (int y = 6; y < 9; y++) {
                block7.add(sudokuRows.get(x).getSudokuElements().get(y));
            }
        }
        for (int x = 3; x < 6; x++) {
            for (int y = 6; y < 9; y++) {
                block8.add(sudokuRows.get(x).getSudokuElements().get(y));
            }
        }
        for (int x = 6; x < 9; x++) {
            for (int y = 6; y < 9; y++) {
                block9.add(sudokuRows.get(x).getSudokuElements().get(y));
            }
        }
    }

    private List<SudokuElement> whichBlock(int row, int column) throws NullPointerException {
        if (row >= 0 && row < 3 && column >= 0 && column < 3) {
            return block1;
        }else if (row >= 3 && row < 6 && column >= 0 && column < 3) {
            return block2;
        }else if (row >= 6 && row < 9 && column >= 0 && column < 3) {
            return block3;
        }else if (row >= 0 && row < 3 && column >= 3 && column < 6) {
            return block4;
        }else if (row >= 3 && row < 6 && column >= 3 && column < 6) {
            return block5;
        }else if (row >= 6 && row < 9 && column >= 3 && column < 6) {
            return block6;
        }else if (row >= 0 && row < 3 && column >= 6 && column < 9) {
            return block7;
        }else if (row >= 3 && row < 6 && column >= 6 && column < 9) {
            return block8;
        }else if (row >= 6 && row < 9 && column >= 6 && column < 9) {
            return block9;
        }
        throw new NullPointerException();
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
