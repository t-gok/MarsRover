package com.intuit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverTest {
    @Test
    public void shouldCreateRoverAndPrintPosition(){
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(new Position(new CartestianCoordinate(0, 0), "N"), plateau);
        rover.printPosition();
    }

    @Test
    public void shouldCreateRoverAndAddToRovers(){
        Plateau plateau = new Plateau(5, 5);
        Rovers rovers = new Rovers();
        rovers.add(new Rover(new Position(new CartestianCoordinate(0, 0), "N"), plateau));
        assertEquals(1, rovers.size());
    }

    @Test
    public void shouldUpdateRoverPosition(){
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(new Position(new CartestianCoordinate(1, 2), "N"), plateau);
        rover.printPosition();
        String instructionsString = "LMLMLMLMM";
        Instruction[] instructions;
        instructions = new Instruction[instructionsString.length()];
        for(int i=0; i<instructionsString.length(); i++){
            instructions[i] = new Instruction(instructionsString.charAt(i));
        }
        rover.updatePosition(instructions);
        rover.printPosition();
        rover = new Rover(new Position(new CartestianCoordinate(3, 3), "E"), plateau);
        rover.printPosition();
        instructionsString = "MMRMMRMRRM";
        instructions = new Instruction[instructionsString.length()];
        for(int i=0; i<instructionsString.length(); i++){
            instructions[i] = new Instruction(instructionsString.charAt(i));
        }
        rover.updatePosition(instructions);
        rover.printPosition();
    }

    @Test
    public void shouldFailToUpdateRoverPosition(){
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(new Position(new CartestianCoordinate(5, 4), "E"), plateau);
        rover.printPosition();
        String instructionsString = "M";
        Instruction[] instructions;
        instructions = new Instruction[instructionsString.length()];
        for(int i=0; i<instructionsString.length(); i++){
            instructions[i] = new Instruction(instructionsString.charAt(i));
        }
        rover.updatePosition(instructions);
        rover.printPosition();
    }

}