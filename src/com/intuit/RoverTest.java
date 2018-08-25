package com.intuit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverTest {
    @Test
    public void shouldCreateRoverAndPrintPosition(){
        Plateau plateau = new Plateau(5, 5);
        Direction direction = Direction.getDirection("N");
        Rover rover = new Rover(new Position(new CartesianCoordinate(0, 0), direction), plateau);
        rover.printPosition();
    }

    @Test
    public void shouldCreateRoverAndAddToRovers(){
        Plateau plateau = new Plateau(5, 5);
        Rovers rovers = new Rovers();
        Direction direction = Direction.getDirection("N");
        rovers.add(new Rover(new Position(new CartesianCoordinate(0, 0), direction), plateau));
        assertEquals(1, rovers.size());
    }

    @Test
    public void shouldUpdateRoverPosition(){
        Plateau plateau = new Plateau(5, 5);
        Direction direction = Direction.getDirection("N");
        Rover rover = new Rover(new Position(new CartesianCoordinate(1, 2), direction), plateau);
        rover.printPosition();
        String instructions = "LMLMLMLMM";
        rover.updatePosition(instructions);
        rover.printPosition();
        direction = Direction.getDirection("E");
        rover = new Rover(new Position(new CartesianCoordinate(3, 3), direction), plateau);
        rover.printPosition();
        instructions = "MMRMMRMRRM";
        rover.updatePosition(instructions);
        rover.printPosition();
    }

    @Test
    public void shouldFailToUpdateRoverPosition(){
        Plateau plateau = new Plateau(5, 5);
        Direction direction = Direction.getDirection("E");
        Rover rover = new Rover(new Position(new CartesianCoordinate(5, 4), direction), plateau);
        rover.printPosition();
        String instructions = "M";
        rover.updatePosition(instructions);
        rover.printPosition();
    }

}