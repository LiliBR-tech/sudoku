package br.com.sudoku;

import br.com.sudoku.Board;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Scanner;

public class ErrorHighlighter {
    public static void highlightErrors(Board board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = board.getCell(i, j);
                if (num != 0 && !Validator.isValidMove(board.getGrid(), i, j, num)) { // ✅ Passa a matriz corretamente
                    System.out.println("Erro em (" + i + "," + j + "): Número inválido " + num);
                    board.highlightCell(i, j); // ✅ Destaca a célula com erro
                }
            }
        }
    }
}