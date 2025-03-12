package br.com.sudoku;

public class ErrorHighlighterTest {
    private GameUI ui;

    @Before
    public void setUp() {
        ui = new GameUI(new JPanel());
    }

    @Test
    public void testHighlightError() {
        // Testa se a célula foi destacada corretamente
        ui.highlightError(5);
        // Verifica se a célula da posição 5 tem o fundo vermelho
        assertEquals(Color.RED, ui.getButton(5).getBackground());
    }
}