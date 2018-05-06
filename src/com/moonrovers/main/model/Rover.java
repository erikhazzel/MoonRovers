package com.moonrovers.main.model;

public class Rover {

  private Coordinate coordinate;
  private Direction direction;
  private final Plateau plateau;

  /**
   * Constructor to create Rover.
   * @param coordinate .
   * @param direction .
   * @param plateau .
   */
  public Rover(Coordinate coordinate, Direction direction, Plateau plateau) {
    this.coordinate = coordinate;
    this.direction = direction;
    this.plateau = plateau;
  }

  /**
   * Method to run the rover based on input.
   * @param commands .
   */
  public void run(final String commands) {
    for (Character command : commands.toCharArray()) {
      switch (command.toString().toUpperCase()) {
        case "L":
          this.direction.turnLeft();
          break;
        case "R":
          this.direction.turnRight();
          break;
        case "M":
          this.move();
          break;
        default:
          throw new IllegalArgumentException(
              "The rover can't understand this command" + command.toString());
      }
    }
  }

  private void move() {
    switch (this.direction.toInteger()) {
      case 0:
        updateCoordinate(0, 1);
        break;
      case 1:
        updateCoordinate(1, 0);
        break;
      case 2:
        updateCoordinate(0, -1);
        break;
      case 3:
        updateCoordinate(-1, 0);
        break;
      default:
        throw new IllegalArgumentException("The rover can't understand this command");
    }
  }

  private void updateCoordinate(final int xCoordinate, final int yCoordinate) {
    final Coordinate updatedCoordinate = this.coordinate;
    updatedCoordinate.updateCoordinate(xCoordinate, yCoordinate);

    if (onPlateau(updatedCoordinate)) {
      this.coordinate = updatedCoordinate;
    } else {
      throw new IllegalStateException("The rover drove of the plateau and broke down.");
    }

  }

  public String getPosition() {
    return this.coordinate.toString() + " " + this.direction.toShortString();
  }

  public void setPosition(final Coordinate coordinate, final Direction direction) {
    this.coordinate = coordinate;
    this.direction = direction;
  }

  private boolean onPlateau(final Coordinate coordinate) {
    return plateau.withinPlateau(coordinate);
  }
}
