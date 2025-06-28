package org.example;


import java.util.List;

public class PawnPiece implements IPiece {
   String name;
   final int ROWS = 8;
   Board board;

   PawnPiece(Board board) {
       this.board = board;
   }

    @Override
    public List<String> getPossibleMoves(Position position) throws Exception {
        if(!board.isValidPosition(position)) {
            throw  new Exception("Invalid Position");
        }
        if(position.getY() != ROWS) {
            Character nextX = position.getXAsChar();
            return List.of(nextX.toString() + (position.getY() + 1));
        }
        return List.of();
    }
}
