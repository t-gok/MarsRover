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

    public void print() {
        for (int i = 0; i < roversList.size(); i++) {
            Rover rover = roversList.get(i);
            rover.printPosition();
        }
    }

    public int size() {
        return roversList.size();
    }
}
