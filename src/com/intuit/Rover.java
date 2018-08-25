package com.intuit;

public class Rover {
    private Position position;
    private Plateau plateau;

    public Rover(Position position, Plateau plateau){
        this.position = position;
        this.plateau = plateau;
    }

    public void updatePosition(String instructions){
        for(int i=0; i<instructions.length(); i++){
            char instruction = instructions.charAt(i);
            Action action = Action.getAction(instruction);
            updatePosition(action);
        }
    }

    private void updatePosition(Action action) {
        position.updateCartesianCoordinate(action, plateau);
        position.updateDirection(action);
    }

    public void printPosition(){
        position.printPosition();
    }
}
