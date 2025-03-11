package br.com.sudoku;

import br.com.sudoku.Board;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GraphicalMode extends Application {
    private GameUI ui;
    private Board board;

    @Override
    public void start(Stage primaryStage) {
        board = new Board();
        ui = new GameUI(board); // Passa o tabuleiro para a UI
        
        Scene scene = new Scene(ui.getRoot(), 400, 400);
        primaryStage.setTitle("Modo Gráfico - Sudoku");
        primaryStage.setScene(scene);
        primaryStage.show();

        updateBoard();
    }

    public void updateBoard() {
        ui.displayBoard();
    }

    public static void main(String[] args) {
        launch(args);
    }
}