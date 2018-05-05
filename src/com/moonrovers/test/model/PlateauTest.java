package com.moonrovers.test.model;

import com.moonrovers.main.model.Coordinate;
import com.moonrovers.main.model.Plateau;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PlateauTest {

    @Test
    public void isOnPlateau() {
        Plateau plateau = new Plateau(
                new Coordinate(0,0), new Coordinate(5,5));

        assertTrue(plateau.withinPlateau(new Coordinate(1,2)));
    }

    @Test
    public void isNotOnPlateau() {
        Plateau plateau = new Plateau(
                new Coordinate(0,0), new Coordinate(5,5));

        assertFalse(plateau.withinPlateau(new Coordinate(6,2)));
    }
}
