package com.intuit;

public class Rover {
    private Position position;
    private Plateau plateau;

    public Rover(Position position, Plateau plateau){
        this.position = position;
        this.plateau = plateau;
    }

    public void updatePosition(Instruction[] instructions){
        for(Instruction instruction: instructions){
            updatePosition(instruction);
        }
    }

    private void updatePosition(Instruction instruction) {
        position.updateCartesianCoordinate(instruction, plateau);
        position.updateDirection(instruction);
    }

    public void printPosition(){
        position.printPosition();
    }
}
