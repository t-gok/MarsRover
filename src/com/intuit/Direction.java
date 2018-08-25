package com.intuit;

import java.util.HashMap;

public enum Direction {
    NORTH("N") {
        @Override
        public Direction getDirectionForMoveForward() {
            return NORTH;
        }
        @Override
        public Direction getDirectionForRotateLeft() {
            return WEST;
        }
        @Override
        public Direction getDirectionForRotateRight() {
            return EAST;
        }
        @Override
        public CartesianCoordinate getCartesianCoordinateForMoveForward(CartesianCoordinate cartesianCoordinate) {
            return cartesianCoordinate.add(0,1);
        }
    },
    EAST("E") {
        @Override
        public Direction getDirectionForMoveForward() {
            return EAST;
        }
        @Override
        public Direction getDirectionForRotateLeft() {
            return NORTH;
        }
        @Override
        public Direction getDirectionForRotateRight() {
            return SOUTH;
        }
        @Override
        public CartesianCoordinate getCartesianCoordinateForMoveForward(CartesianCoordinate cartesianCoordinate) {
            return cartesianCoordinate.add(1,0);
        }
    },
    WEST("W") {
        @Override
        public Direction getDirectionForMoveForward() {
            return WEST;
        }
        @Override
        public Direction getDirectionForRotateLeft() {
            return SOUTH;
        }
        @Override
        public Direction getDirectionForRotateRight() {
            return NORTH;
        }
        @Override
        public CartesianCoordinate getCartesianCoordinateForMoveForward(CartesianCoordinate cartesianCoordinate) {
            return cartesianCoordinate.add(-1,0);
        }
    },
    SOUTH("S") {
        @Override
        public Direction getDirectionForMoveForward() {
            return SOUTH;
        }
        @Override
        public Direction getDirectionForRotateLeft() {
            return EAST;
        }
        @Override
        public Direction getDirectionForRotateRight() {
            return WEST;
        }
        @Override
        public CartesianCoordinate getCartesianCoordinateForMoveForward(CartesianCoordinate cartesianCoordinate) {
            return cartesianCoordinate.add(0,-1);
        }
    };
    public abstract Direction getDirectionForMoveForward();
    
    public abstract Direction getDirectionForRotateLeft();
    
    public abstract Direction getDirectionForRotateRight();

    public abstract CartesianCoordinate getCartesianCoordinateForMoveForward(CartesianCoordinate cartestianCoordinate);

    private String directionCode;

    private Direction(String directionCode){
        this.directionCode = directionCode;
    }

    public static Direction getDirection(String directionCode){
        for(Direction direction: Direction.values()){
            if(direction.directionCode.equals(directionCode)) return direction;
        }
        return null;
    }

    public String getDirectionString(){
        return this.directionCode;
    }
}
