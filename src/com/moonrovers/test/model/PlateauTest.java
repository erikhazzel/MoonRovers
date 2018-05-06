package com.moonrovers.test.model;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import com.moonrovers.main.model.Coordinate;
import com.moonrovers.main.model.Plateau;
import org.testng.annotations.Test;

public class PlateauTest {

  @Test
  public void isOnPlateau() {
    Plateau plateau = new Plateau(
        new Coordinate(0, 0), new Coordinate(5, 5));

    assertTrue(plateau.withinPlateau(new Coordinate(3, 2)));
  }

  @Test
  public void isNotOnPlateau() {
    Plateau plateau = new Plateau(
        new Coordinate(0, 0), new Coordinate(5, 5));

    assertFalse(plateau.withinPlateau(new Coordinate(6, 2)));
  }

  @Test
  public void canBeOnBottomLeft() {
    Plateau plateau = new Plateau(
        new Coordinate(0, 0), new Coordinate(5, 5));

    assertTrue(plateau.withinPlateau(new Coordinate(0, 0)));
  }

  @Test
  public void canBeOnTopRight() {
    Plateau plateau = new Plateau(
        new Coordinate(0, 0), new Coordinate(5, 5));

    assertTrue(plateau.withinPlateau(new Coordinate(5, 5)));
  }
}
