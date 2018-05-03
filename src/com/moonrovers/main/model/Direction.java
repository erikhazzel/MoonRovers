package com.moonrovers.main.model;

/**
 * Class that represents the cardinal direction.
 */
public class Direction {

    private static final int NORTH = 0;
    private static final int EAST = 1;
    private static final int SOUTH = 2;
    private static final int WEST = 3;

    private int direction;

    public Direction(String directionArg) {
        switch (directionArg.toUpperCase()) {
            case "N":
                this.direction = NORTH;
                break;
            case "E":
                this.direction = EAST;
                break;
            case "S":
                this.direction = SOUTH;
                break;
            case "W":
                this.direction = WEST;
                break;
            default:
                throw new IllegalArgumentException("Invalid direction: " + directionArg);
        }
    }

    public void turn(String turnDirection) {
        switch (turnDirection.toUpperCase()) {
            case "L":
                turnLeft();
                break;
            case "R":
                turnRight();
                break;
            default:
                throw new IllegalArgumentException("Can only turn Left or Right, not: " + turnDirection);
        }
    }

    private void turnLeft() {
        switch (direction) {
            case NORTH:
                this.direction = WEST;
                break;
            case EAST:
                this.direction = NORTH;
                break;
            case SOUTH:
                this.direction = EAST;
                break;
            case WEST:
                this.direction = SOUTH;
                break;
            default:
                throw new IllegalArgumentException("This shouldnt happen :(");
        }

    }

    private void turnRight() {
        switch (direction) {
            case NORTH:
                this.direction = EAST;
                break;
            case EAST:
                this.direction = SOUTH;
                break;
            case SOUTH:
                this.direction = WEST;
                break;
            case WEST:
                this.direction = NORTH;
                break;
            default:
                throw new IllegalArgumentException("This shouldnt happen :(");
        }

    }

    public String getShortDirection() {
        String shortDirection;
        switch (direction) {
            case NORTH:
                shortDirection = "N";
                break;
            case EAST:
                shortDirection = "E";
                break;
            case SOUTH:
                shortDirection = "S";
                break;
            case WEST:
                shortDirection = "W";
                break;
            default:
                throw new IllegalArgumentException("This shouldnt happen :(");
        }
        return shortDirection;
    }

}
