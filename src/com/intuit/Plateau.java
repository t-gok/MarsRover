package com.intuit;

public class Plateau {
    int length, breadth;

    public Plateau(int x, int y){
        length = x;
        breadth = y;
    }

    public boolean isOutOfBounds(CartesianCoordinate cartesianCoordinate){
        return !cartesianCoordinate.isWithinTheRectangleFormedByPlateau(length, breadth);
    }
}
