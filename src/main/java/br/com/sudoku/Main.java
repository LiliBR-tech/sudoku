package br.com.sudoku;

import br.com.sudoku.Board;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escolha o modo de jogo:");
        System.out.println("1 - Modo Gráfico");
        System.out.println("2 - Modo Console");
        System.out.println("3 - Modo Avançado (Em desenvolvimento)");

        // Simula automaticamente a escolha do modo Console
        int choice = 2;
        System.out.println("Modo selecionado automaticamente: " + choice);

        switch (choice) {
            case 1:
                System.out.println("Iniciando Modo Gráfico...");
                break;
            case 2:
                System.out.println("Iniciando Modo Console...");
                Board board = new Board();
                board.generate(); // Agora gera um tabuleiro real
                System.out.println(board);
                break;
            case 3:
                System.out.println("Iniciando Modo Avançado...");
                break;
            default:
                System.out.println("Opção desconhecida.");
        }
    }
}