package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGameRunner {
    public static void main(String[] args) {
        boolean gameFinished = false;
        SudokuGame theGame = new SudokuGame();
        SudokuBoard board = new SudokuBoard();
        Scanner scanner = new Scanner(System.in);

        System.out.println("place your numbers on sudoku board to resolve");
        System.out.println("writing in console columnIndex, rowIndex, value");
        System.out.println("entered numbers must be in range from 1 to 9");
        System.out.println("confirm your entry by pressing enter(return)");
        System.out.println("when you finish setting the board type SUDOKU and press enter(return)");

        while(!gameFinished) {

            System.out.println(board.toString());

            gameFinished = theGame.resolveSudoku(scanner.nextLine(), board);

        }
    }
}
