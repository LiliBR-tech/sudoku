package br.com.sudoku;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ScoreboardTest {

    @Test
    public void testAddAndRetrieveScore() {
        Scoreboard scoreboard = new Scoreboard();
        scoreboard.addScore("Alice", 50);
        scoreboard.addScore("Bob", 30);

        assertEquals(50, scoreboard.getScore("Alice"));
        assertEquals(30, scoreboard.getScore("Bob"));
    }

    @Test
    public void testGetTopScores() {
        Scoreboard scoreboard = new Scoreboard();
        scoreboard.addScore("Alice", 50);
        scoreboard.addScore("Bob", 30);
        scoreboard.addScore("Charlie", 70);

        List<Integer> topScores = scoreboard.getTopScores();
        assertEquals(List.of(70, 50, 30), topScores);
    }

    @Test
    public void testIncreaseScore() {
        Scoreboard scoreboard = new Scoreboard();
        
        // Criando mais de um jogador antes de chamar increaseScore()
        scoreboard.addScore("Alice", 50);
        scoreboard.addScore("Bob", 30);

        scoreboard.increaseScore(10);

        assertEquals(60, scoreboard.getScore("Alice"));
        assertEquals(40, scoreboard.getScore("Bob"));
    }
}