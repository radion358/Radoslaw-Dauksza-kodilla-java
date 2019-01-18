package com.kodilla.sudoku;

import java.util.Random;
import java.util.regex.Pattern;

class SudokuGame {
    Random random = new Random();

    boolean resolveSudoku(String entry, SudokuBoard board) {
        if ("SUDOKU".equals(entry)) {

            while (board.getSudokuRows().stream()
                    .flatMap(row -> row.getSudokuElements().stream())
                    .filter(element -> element.getValue() > -1).count() > 0) {
                board.setElementValue(random.nextInt(9),random.nextInt(9), random.nextInt(10));
                System.out.println(board);
            }
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
