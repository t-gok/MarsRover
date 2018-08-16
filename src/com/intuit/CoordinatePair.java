package com.intuit;

import javafx.util.Pair;

public class CoordinatePair {
    Pair<Integer, Integer> coordinatePair;

    public CoordinatePair(Integer x, Integer y) {
        coordinatePair = new Pair<Integer, Integer>(x, y);
    }

    private Integer getX(){
        return coordinatePair.getKey();
    }

    private Integer getY(){
        return coordinatePair.getValue();
    }

    public CoordinatePair add(CoordinatePair coordinatePair){
        return new CoordinatePair(getX() + coordinatePair.getX(), getY() + coordinatePair.getY());
    }

    public String getCoordinatePairString(){
        return getX() + " " + getY();
    }

    public boolean isLessThanOrEqualTo(CoordinatePair coordinatePair){
        return getX() <= coordinatePair.getX() && getY() <= coordinatePair.getY();
    }
}
