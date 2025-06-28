package org.example;

public class PieceFactory {
    Board board;

    PieceFactory(Board board) {
        this.board = board;
    }

    public  IPiece getPiece(PieceType piece) {

        switch (piece) {
            case PAWN:
                return new PawnPiece(board);
            case KING:
                return new KingPiece(board);
            case QUEEN:
                return new QueenPiece(board);
            default:
                throw new RuntimeException("Invalid PieceType");
        }
    }
}

