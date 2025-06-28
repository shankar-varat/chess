package org.example;

import java.util.ArrayList;
import java.util.List;

public class Move {

    int[][] dirs;
    int steps;
    Position currentPosition;
    Board board;

    Move(int[][] dirs, int steps, Position currentPosition, Board board) {
        this.dirs = dirs;
        this.steps = steps;
        this.currentPosition = currentPosition;
        this.board = board;
    }

    List<String> getPossibleMoves() {
        List<String> possibleMoves = new ArrayList<>();

        for (int[] dir : dirs) {
            for(int i = 0; i < steps; ++i) {
                Position nextPosition = currentPosition.getNextPosition(dir, i);
                if (board.isValidPosition(nextPosition)) {
                    possibleMoves.add(nextPosition.toString());
                }
            }
        }
        return  possibleMoves;
    }
}
