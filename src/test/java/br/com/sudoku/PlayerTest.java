package br.com.sudoku;

public class PlayerTest {
    private Player player;
    private Board board;

    @Before
    public void setUp() {
        player = new Player("Jogador 1");
        board = new Board();
    }

    @Test
    public void testPlayerMove() {
        // Simula uma jogada válida e verifica o estado do tabuleiro
        player.makeMove(1, board);
        assertEquals("X", board.getCell(1));
    }
}