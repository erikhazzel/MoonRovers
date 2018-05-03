package com.moonrovers.test.com.test.model;

import com.moonrovers.main.model.Direction;

import static org.testng.Assert.*;

public class DirectionTest {

    @org.testng.annotations.Test
    public void testTurnLeft() {
        Direction direction = new Direction("N");
        direction.turn("L");

        assertEquals(direction.getShortDirection(), "W");
    }

    @org.testng.annotations.Test
    public void testTurnRight() {
        Direction direction = new Direction("E");
        direction.turn("R");

        assertEquals(direction.getShortDirection(), "S");
    }
}