package com.intuit;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class Position {
    private CartestianCoordinate cartestianCoordinate;
    private Direction direction;

    public Position(CartestianCoordinate cartestianCoordinate, String directionCode){
       this.cartestianCoordinate = cartestianCoordinate;
       this.direction = Direction.directionCodeToNameMap.get(directionCode);
    }

    public void updateCartesianCoordinate(Instruction instruction, Plateau plateau){
        CartestianCoordinate possiblyNextCartesianCoordinate = direction.nextPossibleCartesianCoordinate(cartestianCoordinate, instruction);
        cartestianCoordinate = plateau.isOutOfBounds(possiblyNextCartesianCoordinate) ? cartestianCoordinate : possiblyNextCartesianCoordinate;
    }

    public void updateDirection(Instruction instruction) {
        direction = direction.nextDirection(instruction);
    }

    public void printPosition() {
        System.out.println(cartestianCoordinate.getCartesianCoordinateStringRepresentation() + "->" + direction);
    }
}
