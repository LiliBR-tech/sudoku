package br.com.sudoku;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void testSetCell() {
        Board board = new Board();
        board.setCell(0, 0, 5);
        assertEquals(5, board.getCell(0, 0));
    }

    @Test
    void testIsFull() {
        Board board = new Board();
        assertFalse(board.isFull()); // Verifica se o tabuleiro inicialmente não está cheio

        // Preenche todo o tabuleiro
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board.setCell(i, j, 1);
            }
        }

        assertTrue(board.isFull()); // Agora deve estar cheio
    }

    @Test
    void testHighlightCell() {
        Board board = new Board();
        board.highlightCell(2, 2);
        assertTrue(board.isCellHighlighted(2, 2));
    }

    @Test
    void testUpdateBoard() {
        Board board = new Board();
        assertDoesNotThrow(() -> board.updateBoard(3, 3));
    }

    @Test
    void testScore() {
        Board board = new Board();
        board.addScore(10);
        assertEquals(10, board.getScore());

        board.addScore(5);
        assertEquals(15, board.getScore());
    }
}
