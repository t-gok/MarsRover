package com.intuit;

public enum Action {
    MOVE_FORWARD('M'){
        @Override
        public CartesianCoordinate getCartesianCoordinate(CartesianCoordinate cartesianCoordinate, Direction direction, Plateau plateau){
            CartesianCoordinate possiblyNextCartesianCoordinate = direction.getCartesianCoordinateForMoveForward(cartesianCoordinate);
            return plateau.isOutOfBounds(possiblyNextCartesianCoordinate) ? cartesianCoordinate : possiblyNextCartesianCoordinate;
        }
        @Override
        public Direction getDirection(Direction direction){
            return direction.getDirectionForMoveForward();
        }
    },
    ROTATE_LEFT('L'){
        @Override
        public CartesianCoordinate getCartesianCoordinate(CartesianCoordinate cartesianCoordinate, Direction direction, Plateau plateau){
            return cartesianCoordinate;
        }
        @Override
        public Direction getDirection(Direction direction){
            return direction.getDirectionForRotateLeft();
        }
    },
    ROTATE_RIGHT('R'){
        @Override
        public CartesianCoordinate getCartesianCoordinate(CartesianCoordinate cartesianCoordinate, Direction direction, Plateau plateau){
            return cartesianCoordinate;
        }
        @Override
        public Direction getDirection(Direction direction){
            return direction.getDirectionForRotateRight();
        }
    };
    private char instruction;
    private Action(char instruction){
        this.instruction = instruction;
    }
    public static Action getAction(char instruction){
        for(Action action: Action.values()){
            if(action.instruction == instruction)
                return action;
        }
        return null;
    }

    public abstract CartesianCoordinate getCartesianCoordinate(CartesianCoordinate cartesianCoordinate, Direction direction, Plateau plateau);
    public abstract Direction getDirection(Direction direction);
};
