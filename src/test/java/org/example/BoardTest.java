package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BoardTest {

    @Test
    public void isValidPosition() {
        Position position = new Position('Z', 1);

        Board board = new Board();
        Boolean result = board.isValidPosition(position);

        assertEquals(false, result);
    }
}
