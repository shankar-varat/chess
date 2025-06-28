package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PawnPieceTest {
//
//    @Mock
//    Board mockBoard;

    @Test
    public void shouldPassForValidPossibleMoves() throws Exception {
        /*
        Given
         */
        Position position = new Position('G', 1);
        List<String> expectedPossibleMoves = List.of("G2");

        /*
        When
         */
        Board mockBoard = mock(Board.class);
        PawnPiece pawnPiece = new PawnPiece(mockBoard);
        when(mockBoard.isValidPosition(position)).thenReturn(true);
        List<String> actualPossibleMoves = pawnPiece.getPossibleMoves(position);

        /*
        Then
         */
        assertEquals(expectedPossibleMoves, actualPossibleMoves);
    }
}
