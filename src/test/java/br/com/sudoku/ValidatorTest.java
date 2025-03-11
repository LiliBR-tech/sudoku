package br.com.sudoku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void testIsValidMove() {
        Board board = new Board();
        board.setCell(0, 0, 5);
        assertTrue(Validator.isValidMove(board, 0, 1, 3));
        assertFalse(Validator.isValidMove(board, 0, 1, 5));
    }
}