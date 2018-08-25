package com.intuit;

public class CartesianCoordinate {
    private int x;
    private int y;

    public CartesianCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public CartesianCoordinate add(int x, int y) {
        return new CartesianCoordinate(this.x  + x, this.y + y);
    }

    public String getCartesianCoordinateString() {
        return String.format("(%d,%d)", x, y);
    }

    public boolean isWithinTheRectangleFormedByPlateau(int x, int y) {
        return ((this.x <= x && this.y <=y) && (this.x >= 0 && this.y >= 0));
    }
}
