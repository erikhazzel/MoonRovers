package com.moonrovers.main.model;

public class Rover {

    private Coordinate coordinate;
    private Direction direction;

    public Rover(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }


    //Bryta ut till domainService?
    public void runRover(final String startPosition, final String commands){
        //set start position


        //Splitta upp kommandot
        for (Character command: commands.toCharArray()) {
            switch (command.toString().toUpperCase()){
                case "L":
                    this.direction.turnLeft();
                    break;
                case "R":
                    this.direction.turnRight();
                    break;
                case "M":
                    this.coordinate.updateCoordinate();
                    break;
                default: throw new IllegalArgumentException("The rover can't understand this command" + command.toString());
            }

        }



        //Kör sedan move/turn beroende på kommandotecken
    }




}
