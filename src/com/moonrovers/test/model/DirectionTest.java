package com.moonrovers.test.model;

import static org.testng.Assert.assertEquals;

import com.moonrovers.main.model.Direction;

public class DirectionTest {

  @org.testng.annotations.Test
  public void testTurnLeft() {
    Direction direction = new Direction("N");
    direction.turnLeft();

    assertEquals(direction.toShortString(), "W");
  }

  @org.testng.annotations.Test
  public void testTurnRight() {
    Direction direction = new Direction("E");
    direction.turnRight();

    assertEquals(direction.toShortString(), "S");
  }
}