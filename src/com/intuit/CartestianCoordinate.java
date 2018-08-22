package com.intuit;

public class CartestianCoordinate {
    private int X, Y;

    public CartestianCoordinate(int x, int y) {
        X = x;
        Y = y;
    }

    public CartestianCoordinate addX(int x) {
        return new CartestianCoordinate(X+x, Y);
    }

    public CartestianCoordinate addY(int y) {
        return new CartestianCoordinate(X, Y+y);
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public String getCartesianCoordinateStringRepresentation(){
        return String.format("(%d,%d)", X, Y);
    }
}
