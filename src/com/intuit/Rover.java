package com.intuit;

public class Rover {
    private Position position;

    public Rover(Position position){
        this.position = position;
    }

    public void updatePosition(String moves, CoordinatePair plateauDimensionsPair){
        position.updatePosition(moves, plateauDimensionsPair);
    }

    public void printPosition(){
        position.printPosition();
    }
}
