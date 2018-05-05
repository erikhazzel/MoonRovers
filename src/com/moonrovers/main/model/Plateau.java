package com.moonrovers.main.model;

public class Plateau {

    private Coordinate bottomLeftCoordinate;
    private Coordinate topRightCoordinate;

    public Plateau(Coordinate bottomLeftCoordinate, Coordinate topRightCoordinate) {
        this.bottomLeftCoordinate = bottomLeftCoordinate;
        this.topRightCoordinate = topRightCoordinate;
    }

    public Coordinate getBottomLeftCoordinate() {
        return bottomLeftCoordinate;
    }

    public Coordinate getTopRightCoordinate() {
        return topRightCoordinate;
    }

}
