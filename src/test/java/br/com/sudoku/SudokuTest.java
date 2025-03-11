package br.com.sudoku;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SudokuTest {

    @Test
    public void testInserirNumero() {
        Sudoku jogo = new Sudoku();
        jogo.inserirNumero(0, 0, 5);
        assertEquals(5, jogo.tabuleiro[0][0]);  // Verifica se o número foi inserido corretamente
    }

    @Test
    public void testJogoCompleto() {
        Sudoku jogo = new Sudoku();
        preencherTabuleiro(jogo);
        assertTrue(jogo.jogoCompleto());  // O jogo deve ser considerado completo
    }

    private void preencherTabuleiro(Sudoku jogo) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                jogo.tabuleiro[i][j] = (i + j) % 9 + 1;  // Preenche o tabuleiro com números válidos
            }
        }
    }
}