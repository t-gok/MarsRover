package com.intuit;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) throws Exception{
        String inputLine = scanner.nextLine();
        String[] plateauDimensions = inputLine.split(" ");
        assert plateauDimensions.length == 2 : "There must be two coordinates in the input representing the dimensions of the plateau";
        Plateau plateau = new Plateau(new Integer(plateauDimensions[0]), new Integer(plateauDimensions[1]));

        String[] roverPosition;
        String instructions;
        Rovers rovers = new Rovers();
        inputLine = scanner.nextLine();
        while(!inputLine.equals("")){
            roverPosition = inputLine.split(" ");
            assert roverPosition.length == 3 : "There must be three characters in the input indicating Rover's position";
            Rover rover = new Rover(new Position(new CartesianCoordinate(new Integer(roverPosition[0]), new Integer(roverPosition[1])), Direction.getDirection(roverPosition[2])), plateau);
            rovers.add(rover);
            instructions = scanner.nextLine();
            rover.updatePosition(instructions);
            inputLine = scanner.nextLine();
        }
        rovers.print();
    }
}