package com.moonrovers.test.model;

import static org.testng.Assert.assertEquals;

import com.moonrovers.main.model.Coordinate;
import com.moonrovers.main.model.Direction;
import com.moonrovers.main.model.Plateau;
import com.moonrovers.main.model.Rover;
import org.testng.annotations.Test;


public class RoverTest {

  @Test
  public void testRunRover() {
    Plateau plateau = new Plateau(
        new Coordinate(0, 0), new Coordinate(5, 5));

    Rover rover1 = new Rover(new Coordinate(1, 2), new Direction("N"), plateau);
    rover1.run("LMLMLMLMM");

    assertEquals(rover1.getPosition(), "1 3 N");

    Rover rover2 = new Rover(new Coordinate(3, 3), new Direction("E"), plateau);
    rover2.run("MMRMMRMRRM");

    assertEquals(rover2.getPosition(), "5 1 E");
  }

  @Test(expectedExceptions = IllegalStateException.class)
  public void shouldThrowExceptionIfRoverDriveOffPlateau() {
    Plateau plateau = new Plateau(
        new Coordinate(0, 0), new Coordinate(3, 3));

    Rover rover1 = new Rover(new Coordinate(3, 3), new Direction("E"), plateau);
    rover1.run("LMLMLMLMM");

  }
}
