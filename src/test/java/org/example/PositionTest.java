package org.example;

import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    public void getPosition() {

        System.out.println((char)(0 + 'A'));
        System.out.println(new Position(1, 1).getXAsChar());
//        System.out.println(new Position(1, 1));

    }
}
