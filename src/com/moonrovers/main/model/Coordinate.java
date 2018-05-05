package com.moonrovers.main.model;

public class Coordinate {

    private Integer xCoordinate;
    private Integer yCoordinate;

    public Coordinate(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }


    public void updateCoordinate(final int xCoordinate, final int yCoordinate){
        this.xCoordinate = this.xCoordinate + xCoordinate;
        this.yCoordinate = this.yCoordinate + yCoordinate;
    }

    public String getCoordinate(){
        return xCoordinate.toString() + " " + yCoordinate.toString();
    }
}
