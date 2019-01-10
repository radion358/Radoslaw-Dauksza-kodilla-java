package com.kodilla.sudoku;

import java.util.regex.Pattern;

class SudokuGame {
    boolean resolveSudoku(String entry, SudokuBoard board) {
        if ("SUDOKU".equals(entry)) {
            return true;
        }else if (Pattern.matches("[1-9],[1-9],[0-9]", entry)) {
            int columnIndex = Integer.parseInt(entry.substring(0, 1)) - 1;
            int rowIndex = Integer.parseInt(entry.substring(2, 3)) - 1;
            int value = Integer.parseInt(entry.substring(4, 5));
            board.setElementValue(columnIndex, rowIndex, value);
        }
        return false;
    }
}
