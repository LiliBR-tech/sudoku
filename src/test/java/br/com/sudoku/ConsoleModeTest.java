package br.com.sudoku;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.testfx.framework.junit5.ApplicationTest;


public class ConsoleModeTest {
    private Board board;
    private Player player;
    private ConsoleMode consoleMode;

    @Before
    public void setUp() {
        board = new Board();
        player = new Player("Jogador 1");
        consoleMode = new ConsoleMode(board, player);
    }

    @Test
    public void testStartGame() {
        // Simula uma partida
        consoleMode.startGame();
        // Verifique se a vitória ou empate aconteceu corretamente
        assertTrue(board.isFull() || board.checkVictory(player));
    }
}   