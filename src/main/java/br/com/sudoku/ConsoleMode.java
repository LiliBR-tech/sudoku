package br.com.sudoku;

import java.util.Scanner;
import br.com.sudoku.Board;

public class ConsoleMode {
    private Board board;

    // Construtor padrão que cria um tabuleiro automaticamente
    public ConsoleMode() {
        this.board = new Board();
        board.generate(); // Gera um tabuleiro aleatório
    }

    // Construtor alternativo que recebe um tabuleiro (opcional)
    public ConsoleMode(Board board) {
        this.board = board;
    }

    // Método para iniciar o jogo no console
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Sudoku - Modo Console!");
        System.out.println(board);

        while (true) {
            System.out.print("Digite linha, coluna e valor (ex: 1 2 5) ou 'sair' para encerrar: ");
            if (scanner.hasNext("sair")) {
                System.out.println("Encerrando o jogo...");
                break;
            } else if (scanner.hasNextInt()) {
                int linha = scanner.nextInt();
                int coluna = scanner.nextInt();
                int valor = scanner.nextInt();

                if (board.isValidMove(linha, coluna, valor)) {
                    board.setCell(linha, coluna, valor);
                    System.out.println("Movimento realizado!");
                } else {
                    System.out.println("Movimento inválido! Tente novamente.");
                }

                System.out.println(board);
            } else {
                scanner.next(); // Descarta entrada inválida
                System.out.println("Entrada inválida, tente novamente.");
            }
        }

        scanner.close();
    }

    // Adicionando o método main para permitir a execução direta
    public static void main(String[] args) {
        ConsoleMode console = new ConsoleMode();
        console.startGame();
    }
}