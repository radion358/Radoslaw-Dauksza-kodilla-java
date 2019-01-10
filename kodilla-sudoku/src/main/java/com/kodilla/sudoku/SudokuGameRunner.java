package com.kodilla.sudoku;

public class SudokuGameRunner {
    public static void main(String[] args) {
        boolean gameFinished = false;
        SudokuBoard board = new SudokuBoard();


        System.out.println("place your numbers on sudoku board to resolve");
        System.out.println("writing in console columnIndex, rowIndex, value");
        System.out.println("entered numbers must be in range from 1 to 9");
        System.out.println("confirm your entry by pressing enter(return)");
        System.out.println("when you finish setting the board type SUDOKU and press enter(return)");

        while(!gameFinished) {

            System.out.println(board.toString());

            gameFinished = true;

        }
    }
}
