package org.example;

import java.util.ArrayList;
import java.util.List;

public class QueenPiece implements IPiece{
    Board board;

    QueenPiece(Board board) {
        this.board = board;
    }

    final int[][] dirs = {
            {0, -1}, {-1,-1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}
    };

    @Override
    public List<String> getPossibleMoves(Position position) throws Exception {
        int STEPS = board.COLS;
        Move move = new Move(dirs, STEPS, position, board);
        return move.getPossibleMoves();
    }
}



//
//        for (int[] dir : dirs) {
//        for(int i = 0; i < times; ++i) {
//int nextX = position.getX() + i * dir[0];
//int nextY = position.getY() + i * dir[1];
//                if(nextX == position.getX() && nextY == position.getY()) continue;
//        if (board.isValidPosition(new Position(nextX, nextY))) {
//        possibleMoves.add(new Position(nextX, nextY).toString());
//        }
//        }
//        }