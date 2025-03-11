package br.com.sudoku;

public class Sudoku {
    protected int[][] tabuleiro;

    public Sudoku() { 
        tabuleiro = new int[9][9];
    }

    public boolean validarJogada(int linha, int coluna, int numero) {
        for (int i = 0; i < 9; i++) {
            if (tabuleiro[linha][i] == numero || tabuleiro[i][coluna] == numero) {
                return false;
            }
        }
        int inicioLinha = (linha / 3) * 3;
        int inicioColuna = (coluna / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[inicioLinha + i][inicioColuna + j] == numero) {
                    return false;
                }
            }
        }
        return true;
    }

    public void inserirNumero(int linha, int coluna, int numero) {
        if (tabuleiro[linha][coluna] == 0) {
            if (validarJogada(linha, coluna, numero)) {
                tabuleiro[linha][coluna] = numero;
                System.out.println("Número inserido com sucesso!");
            } else {
                System.out.println("\u001B[31mErro: Jogada inválida. Tente outro número.\u001B[0m");
            }
        } else {
            System.out.println("\u001B[31mErro: posição já preenchida. Escolha outra.\u001B[0m");
        }
    }
}