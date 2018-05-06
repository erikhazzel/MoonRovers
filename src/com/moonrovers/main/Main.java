package com.moonrovers.main;

import com.moonrovers.main.model.Coordinate;
import com.moonrovers.main.model.Direction;
import com.moonrovers.main.model.Plateau;
import com.moonrovers.main.model.Rover;

public class Main {


  /**
   * Method that performs the assignment.
   * @param args .
   */
  public static void main(String[] args) {
    Plateau plateau = new Plateau(
        new Coordinate(0, 0), new Coordinate(5, 5));

    Rover rover1 = new Rover(new Coordinate(1, 2), new Direction("N"), plateau);
    rover1.run("LMLMLMLMM");

    Rover rover2 = new Rover(new Coordinate(3, 3), new Direction("E"), plateau);
    rover2.run("MMRMMRMRRM");


    System.out.println(rover1.getPosition());
    System.out.println(rover2.getPosition());
  }
}
