package com.intuit;

// why not Integer over integer

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class Position {
    private CoordinatePair coordinatePair;
    private String direction;
    private static Map<String, Callable> stepsToReachNextPosition = null;

    public Position(Integer x, Integer y, String direction){
       coordinatePair = new CoordinatePair(x, y);
       this.direction = direction;
       Position.stepsToReachNextPosition = new HashMap<String, Callable>(){{
            put("NL", (Callable)() -> new Position(0, 0, "W"));
            put("EL", (Callable)() -> new Position(0, 0, "N"));
            put("WL", (Callable)() -> new Position(0, 0, "S"));
            put("SL", (Callable)() -> new Position(0, 0, "E"));
            put("NR", (Callable)() -> new Position(0, 0, "E"));
            put("ER", (Callable)() -> new Position(0, 0, "S"));
            put("WR", (Callable)() -> new Position(0, 0, "N"));
            put("SR", (Callable)() -> new Position(0, 0, "W"));
            put("NM", (Callable)() -> new Position(0, 1, "N"));
            put("EM", (Callable)() -> new Position(1, 0, "E"));
            put("WM", (Callable)() -> new Position(-1, 0, "W"));
            put("SM", (Callable)() -> new Position(0, -1, "S"));
        }};
    }

    public CoordinatePair moveBy(CoordinatePair nextStepsPair){
        return coordinatePair.add(nextStepsPair);
    }

    public void updatePosition(String moves, CoordinatePair plateauDimensionsPair) {
        for(char move: moves.toCharArray()) {
            Position nextSteps = null;
            try {
                Callable getNextSteps = stepsToReachNextPosition.get(direction + move);
                nextSteps = (Position) getNextSteps.call();
            } catch (Exception e) {
                e.printStackTrace();
            }
            CoordinatePair tmp = coordinatePair;
            CoordinatePair possibleNextPair = moveBy(nextSteps.coordinatePair);
            coordinatePair = possibleNextPair.isLessThanOrEqualTo(plateauDimensionsPair)? possibleNextPair: coordinatePair;
            direction = nextSteps.direction;
        }
    }

    public void printPosition() {
        System.out.println(coordinatePair.getCoordinatePairString() + " " + direction);
    }
}
