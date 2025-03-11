package br.com.sudoku;

import br.com.sudoku.Board;

public class Game {
    private Board board;
    private Player player1;

    public Game() {
        board = new Board();
        player1 = new Player("Jogador 1");

        // Criando um novo ConsoleMode sem passar parâmetros
        ConsoleMode consoleMode = new ConsoleMode();
        consoleMode.startGame();
    }
}