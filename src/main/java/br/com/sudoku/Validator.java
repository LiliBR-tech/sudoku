package br.com.sudoku;

public class Validator {

    public static boolean isValidMove(int[][] board, int row, int col, int num) {
        return !isInRow(board, row, num) && !isInCol(board, col, num) && !isInBox(board, row, col, num);
    }

    private static boolean isInRow(int[][] board, int row, int num) {
        for (int col = 0; col < 9; col++) {
            if (board[row][col] == num) {
                return true;
            }
        }
        return false;
    }

    private static boolean isInCol(int[][] board, int col, int num) {
        for (int row = 0; row < 9; row++) {
            if (board[row][col] == num) {
                return true;
            }
        }
        return false;
    }

    private static boolean isInBox(int[][] board, int row, int col, int num) {
        int boxRowStart = (row / 3) * 3;
        int boxColStart = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[boxRowStart + i][boxColStart + j] == num) {
                    return true;
                }
            }
        }
        return false;
    }
}