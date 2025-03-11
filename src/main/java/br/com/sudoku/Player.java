package br.com.sudoku;

import java.util.Scanner;

public class Player {
    private String name;
    private Scanner scanner;

    public Player(String name) {
        this.name = name;
        this.scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public int getRow() {
        System.out.print("Digite a linha (0-8): ");
        return scanner.nextInt();
    }

    public int getCol() {
        System.out.print("Digite a coluna (0-8): ");
        return scanner.nextInt();
    }

    public int getNumber() {
        System.out.print("Digite o número (1-9): ");
        return scanner.nextInt();
    }

    public void switchPlayer() {
        // Lógica para alternar jogadores, por exemplo:
        this.name = this.name.equals("Jogador 1") ? "Jogador 2" : "Jogador 1";
    }
}