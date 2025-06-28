package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueenPieceTest {
    @Test
    public void shouldPassForValidPossibleMoves() throws Exception {
        Position position = new Position('E', 4);
        String expectedPossibleMoves = "[E3, E2, E1, D3, C2, B1, D4, C4, B4, D5, C6, B7, E5, E6, E7, E8, F5, G6, H7, I8, F4, G4, H4, I4, F3, G2, H1]";

        // TODO: mock it
        Board board = new Board();
        QueenPiece queenPiece = new QueenPiece(board);
        List<String> actualPossibleMoves = queenPiece.getPossibleMoves(position);

        assertEquals(expectedPossibleMoves, actualPossibleMoves.toString());
    }
}
