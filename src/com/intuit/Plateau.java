package com.intuit;

public class Plateau {
    private CartestianCoordinate cartestianCoordinate;

    public Plateau(int X, int Y){
        cartestianCoordinate = new CartestianCoordinate(X,Y);
    }

    public boolean isOutOfBounds(CartestianCoordinate nextCartesianCoordinate){
        return !((cartestianCoordinate.getX() >= nextCartesianCoordinate.getX()) && (cartestianCoordinate.getY() >= nextCartesianCoordinate.getY()) && (nextCartesianCoordinate.getX()) >= 0 && (nextCartesianCoordinate.getY() >= 0));
    }
}
