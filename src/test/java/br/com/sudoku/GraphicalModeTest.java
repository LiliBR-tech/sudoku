package br.com.sudoku;

public class GraphicalModeTest {
    private Board board;
    private Player player;
    private GameUI ui;
    private GraphicalMode graphicalMode;

    @Before
    public void setUp() {
        board = new Board();
        player = new Player("Jogador 1");
        ui = new GameUI(new JPanel());
        graphicalMode = new GraphicalMode(board, player, ui);
    }

    @Test
    public void testStartGame() {
        // Simula uma partida no modo gráfico
        graphicalMode.startGame();
        // Verifique a lógica de vitória ou empate
        assertTrue(board.isFull() || board.checkVictory(player));
    }
}