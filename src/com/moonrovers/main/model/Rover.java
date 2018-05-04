package com.moonrovers.main.model;

public class Rover {

    private Coordinate coordinate;
    private Direction direction;

    public Rover(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }


    public void runRover(final String command){
        //Splitta upp kommandot
        //Kör sedan move/turn beroende på kommandotecken

    }


}
