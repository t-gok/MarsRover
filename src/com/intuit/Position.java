package com.intuit;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class Position {
    private CartesianCoordinate cartesianCoordinate;
    private Direction direction;

    public Position(CartesianCoordinate cartestianCoordinate, Direction direction){
       this.cartesianCoordinate = cartestianCoordinate;
       this.direction = direction;
    }

    public void updateCartesianCoordinate(Action action, Plateau plateau){
        this.cartesianCoordinate = action.getCartesianCoordinate(cartesianCoordinate, direction, plateau);
    }

    public void updateDirection(Action action) {
        this.direction = action.getDirection(direction);
    }

    public void printPosition() {
        System.out.println(String.format("%s->%s", cartesianCoordinate.getCartesianCoordinateString(), direction.getDirectionString()));
    }
}
