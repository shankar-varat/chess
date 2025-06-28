package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceFactoryTest {

    @Test
    public void ShouldPassForvalidPieceInstance() throws Exception {
        PieceType pieceType = PieceType.QUEEN;

        // TODO: mock board
        Board board = new Board();
        PieceFactory pieceFactory = new PieceFactory(board);
        IPiece piece = pieceFactory.getPiece(pieceType);

        assertEquals(piece.getClass(), QueenPiece.class);
    }
}
