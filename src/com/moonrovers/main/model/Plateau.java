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

    public boolean withinPlateau(final Coordinate roverCoordinate){
        return (roverCoordinate.getyCoordinate() > bottomLeftCoordinate.getyCoordinate()
            && roverCoordinate.getxCoordinate() > bottomLeftCoordinate.getxCoordinate())
                && (roverCoordinate.getyCoordinate() < topRightCoordinate.getyCoordinate()
                && roverCoordinate.getxCoordinate() < topRightCoordinate.getxCoordinate());
    }

}
