package com.intuit;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) throws Exception{
        String inputLine = scanner.nextLine();
        String[] plateauDimensions = inputLine.split(" ");
        assert plateauDimensions.length == 2 : "There must be two coordinates in the input representing the dimensions of the plateau";
        CoordinatePair plateauDimensionsPair = new CoordinatePair(new Integer(plateauDimensions[0]), new Integer(plateauDimensions[1]));

        String[] roverPosition;
        String moves;
        Rovers rovers = new Rovers();
        inputLine = scanner.nextLine();
        while(!inputLine.equals("")){
            roverPosition = inputLine.split(" ");
            assert roverPosition.length == 3 : "There must be three characters in the input indicating Rover's position";
            Rover rover = new Rover(new Position(new Integer(roverPosition[0]), new Integer(roverPosition[1]), roverPosition[2]));
            rovers.add(rover);
            moves = scanner.nextLine();
            rovers.updatePosition(rovers.size()-1, moves, plateauDimensionsPair);
            inputLine = scanner.nextLine();
        }

        for(Integer index=0; index<rovers.size(); index++){
            rovers.printRover(index);
        }
    }
}
