package br.com.sudoku;

import java.util.Random;

public class Board {
    private int[][] grid = new int[9][9]; // Representação do tabuleiro

    // Método para gerar um tabuleiro Sudoku com alguns valores preenchidos automaticamente
    public void generate() {
        Random rand = new Random();
        
        // Preenche algumas células com valores aleatórios (para exemplo)
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Preenche aleatoriamente com números de 1 a 9, mas deixa algumas células vazias
                if (rand.nextInt(3) != 0) {  // A chance de 1/3 de a célula ser deixada vazia
                    grid[i][j] = rand.nextInt(9) + 1;  // Preenche com um número aleatório entre 1 e 9
                } else {
                    grid[i][j] = 0;  // Célula vazia
                }
            }
        }
    }

    // Verifica se um movimento é válido
    public boolean isValidMove(int row, int col, int num) {
        // Lógica de validação (simples para este exemplo)
        return true; // Ajuste com a lógica correta
    }

    // Define um valor em uma célula do tabuleiro
    public void setCell(int row, int col, int num) {
        grid[row][col] = num;
    }

    // Obtém o valor de uma célula do tabuleiro
    public int getCell(int row, int col) {
        return grid[row][col];
    }

    // Retorna a matriz completa do tabuleiro
    public int[][] getGrid() {
        return grid;
    }

    // Método para destacar células com erro (pode ser um marcador lógico)
    public void highlightCell(int row, int col) {
        System.out.println("Erro na célula: (" + row + ", " + col + ")");
    }

    // Sobrescrever o método toString para exibir o tabuleiro de forma legível
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(grid[i][j] == 0 ? "." : grid[i][j]); // Usando '.' para células vazias
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Board board = new Board();
        board.generate(); // Preenche o tabuleiro automaticamente com alguns valores
        System.out.println("Tabuleiro gerado automaticamente:");
        System.out.println(board); // Exibe o tabuleiro no console
    }
}