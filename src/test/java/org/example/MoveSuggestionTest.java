package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveSuggestionTest {

    @Test
    public void ShouldPassForCorrectSuggestedMoves() throws Exception {
        PieceType pieceType = PieceType.PAWN;
        Position position = new Position('G', 5);

        //TODO: mock
        PieceFactory piece = new PieceFactory(new Board());
        String possibleMoves = piece.getPiece(pieceType).getPossibleMoves(position).toString();

        assertEquals("[G6]", possibleMoves);
    }
}
