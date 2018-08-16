package com.intuit;

import java.util.ArrayList;

public class Rovers {
    private ArrayList<Rover> roversList;

    public Rovers(){
        roversList = new ArrayList<>();
    }

    public void add(Rover rover){
        roversList.add(rover);
    }

    public void printRover(Integer index){
        Rover rover = roversList.get(index);
        rover.printPosition();
    }

    public void updatePosition(Integer index, String moves, CoordinatePair plateauDimensionsPair){
        Rover rover = roversList.get(index);
        rover.updatePosition(moves, plateauDimensionsPair);
    }

    public Integer size(){
        return roversList.size();
    }
}
