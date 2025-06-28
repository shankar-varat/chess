package org.example;

public class Board {

     final Integer ROWS = 7;
     final Integer COLS = 7;
     final Integer START_INDEX = 0;

    Board() {

    }

    Boolean isValidPosition(Position position) {
        if(!(position.getX() >= START_INDEX && position.getX() <= ROWS && position.getY() >= START_INDEX && position.getY() <= ROWS)) {
            return false;
        }
        return true;
    }
}

// convert to mock
