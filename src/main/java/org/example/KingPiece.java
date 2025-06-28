package org.example;

import java.util.ArrayList;
import java.util.List;

public class KingPiece implements IPiece{
    Board board;

    KingPiece(Board board) {
        this.board = board;
    }

    // TODO: create a seperate class for Directions
    final int[][] dirs = {
            {0, -1}, {0, 1}, {-1,-1}, {-1, 0}, {-1, 1}, {1, 1}, {1, 0}, {1, -1}
    };

    final int STEPS = 1;

    @Override
    public List<String> getPossibleMoves(Position position) throws Exception {
        Move move = new Move(dirs, STEPS, position, board);
        return move.getPossibleMoves();
    }
}
