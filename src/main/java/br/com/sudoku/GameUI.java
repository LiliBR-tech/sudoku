package br.com.sudoku;

import br.com.sudoku.Board;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class GameUI {

    private Button[][] buttons;
    private GridPane root;
    private Board board;

    // Construtor atualizado para aceitar um Board como parâmetro
    public GameUI(Board board) {
        this.board = (board != null) ? board : new Board(); // Se null, cria um novo Board
        this.root = new GridPane();
        this.buttons = new Button[9][9];
        setupJavaFXUI();
        displayBoard();
    }

    private void setupJavaFXUI() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                buttons[i][j] = new Button();
                buttons[i][j].setPrefSize(50, 50);
                root.add(buttons[i][j], j, i);
            }
        }
    }

    public GridPane getRoot() {
        return root;
    }

    public Button[][] getButtons() {
        return buttons;
    }

    public void displayBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                buttons[i][j].setText(String.valueOf(board.getCell(i, j)));
            }
        }
    }
}