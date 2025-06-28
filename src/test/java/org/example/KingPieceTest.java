package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KingPieceTest {
    @Test
    public void shouldPassForValidPossibleMoves() throws Exception {
        Position position = new Position('D', 5);
        String expectedPossibleMoves = "[D4, D6, C4, C5, C6, E6, E5, E4]";

        // TODO: mock this
        Board board = new Board();
        KingPiece kingPiece = new KingPiece(board);
        List<String> actualPossibleMoves = kingPiece.getPossibleMoves(position);

        assertEquals(expectedPossibleMoves, actualPossibleMoves.toString());
    }

    @Test
    public void shouldPassForValidPossibleMovesInCorner() throws Exception {
        Position position = new Position('A', 0);
        String expectedPossibleMoves = "[D4, C4, C5, C6, D6, E6, E5, E4]";

        // TODO: mock this
        Board board = new Board();
        KingPiece kingPiece = new KingPiece(board);
        List<String> actualPossibleMoves = kingPiece.getPossibleMoves(position);

        assertEquals(expectedPossibleMoves, actualPossibleMoves.toString());
    }

    @Test
    public void shouldThrowExceptionForInvalidPosition() {
        Position position = new Position('Z', 5);

    }
}
