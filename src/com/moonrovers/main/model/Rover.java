package com.moonrovers.main.model;

public class Rover {

    private Coordinate coordinate;
    private Direction direction;
    private Plateau plateau;

    public Rover(Coordinate coordinate, Direction direction, Plateau plateau) {
        this.coordinate = coordinate;
        this.direction = direction;
        this.plateau = plateau;
    }

    //Bryta ut till domainService?
    public void run(final String commands){
        for (Character command: commands.toCharArray()) {
            switch (command.toString().toUpperCase()){
                case "L":
                    this.direction.turnLeft();
                    break;
                case "R":
                    this.direction.turnRight();
                    break;
                case "M":
                    this.move();
                    break;
                default: throw new IllegalArgumentException("The rover can't understand this command" + command.toString());
            }
        }
    }

    public void move(){
        switch (this.direction.getDirection()){
            case 0:
                this.coordinate.updateCoordinate(0,1);
                break;
            case 1:
                this.coordinate.updateCoordinate(1, 0);
                break;
            case 2:
                this.coordinate.updateCoordinate(0, -1);
                break;
            case 3:
                this.coordinate.updateCoordinate(-1, 0);
                break;
            default: throw new IllegalArgumentException("The rover can't understand this command");
        }
    }

    public String getPosition(){
        return this.coordinate.getCoordinate() + " " + this.direction.getShortDirection();
    }

    public void setPosition(final Coordinate coordinate, final Direction direction){
        this.coordinate = coordinate;
        this.direction = direction;
    }

    //TODO: Hur ska jag göra med denna?
    public boolean onPlateau(){
        return plateau.withinPlateau(this.coordinate);
    }
}
