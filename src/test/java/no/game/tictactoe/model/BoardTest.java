package no.game.tictactoe.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Nested
public class BoardTest {

    @Test
    @DisplayName("Beskrivende navn paa hva test gjoer")
    public void test() {
        assertEquals(1,1);
        assertFalse(2 == 1);
        assertTrue(1 == 1);
    }
}
