package com.intuit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverTest {
    @Test void shouldCreateRoverAndPrintPosition(){
        Rover rover = new Rover(new Position(0, 0, "N"));
        rover.printPosition();
    }

    @Test
    public void shouldAppendToRovers(){
        Rovers rovers = new Rovers();
        rovers.add(new Rover(new Position(0, 0, "N")));
        assertEquals(new Integer(1), rovers.size());
    }

    @Test
    public void shouldUpdateRoverPosition(){
        Rover rover = new Rover(new Position(1, 2, "N"));
        rover.printPosition();
        String moves = "LMLMLMLMM";
        CoordinatePair plateauDimensionsPair = new CoordinatePair(5, 5);
        rover.updatePosition(moves, plateauDimensionsPair);
        rover.printPosition();
    }

    @Test
    public void shouldFailToUpdateRoverPosition(){
        Rover rover = new Rover(new Position(5, 4, "E"));
        rover.printPosition();
        CoordinatePair plateauDimensionsPair = new CoordinatePair(5, 5);
        String moves = "M";
        rover.updatePosition(moves, plateauDimensionsPair);
        rover.printPosition();
    }

}