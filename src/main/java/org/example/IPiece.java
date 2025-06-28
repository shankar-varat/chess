package org.example;

import java.util.List;

public interface IPiece {
    List<String> getPossibleMoves(Position position) throws Exception;
}
