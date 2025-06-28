package org.example;

public class Position {
    Integer X, Y;

    Position(Character X, Integer Y) {
        this.X = X - 'A';
        this.Y = Y;
    }

    Position(Integer X, Integer Y) {
        this.X = X;
        this.Y = Y;
    }

    Integer getX() {
        return X;
    }

    Integer getY() {
        return  Y;
    }

    Character getXAsChar() {
        System.out.println(X);
        return (char) (X + 'A');
    }

    @Override
    public String toString() {
        return getXAsChar().toString() + getY();
    }

    Position getNextPosition(int[] dir, int factor) {
        int nextX = getX() + factor * dir[0];
        int nextY = getY() + factor * dir[1];
        Position nextPosition = new Position(nextX, nextY);
        return nextPosition;
    }
}
