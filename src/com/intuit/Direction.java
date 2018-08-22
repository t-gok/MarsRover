package com.intuit;

import java.util.HashMap;

public enum Direction {
    NORTH() {
        @Override
        public Direction nextDirection(Instruction instruction) {
            return instruction.isL() ? WEST : instruction.isR() ? EAST : instruction.isM() ? NORTH : null;
        }
        @Override
        public CartestianCoordinate nextPossibleCartesianCoordinate(CartestianCoordinate cartestianCoordinate, Instruction instruction) {
            return instruction.isM() ? cartestianCoordinate.addY(1) : cartestianCoordinate;
        }
    },
    EAST() {
        @Override
        public Direction nextDirection(Instruction instruction) {
            return instruction.isL() ? NORTH : instruction.isR() ? SOUTH : instruction.isM() ? EAST : null;
        }
        @Override
        public CartestianCoordinate nextPossibleCartesianCoordinate(CartestianCoordinate cartestianCoordinate, Instruction instruction) {
            return instruction.isM() ? cartestianCoordinate.addX(1) : cartestianCoordinate;
        }
    },
    WEST() {
        @Override
        public Direction nextDirection(Instruction instruction) {
            return instruction.isL() ? SOUTH : instruction.isR() ? NORTH : instruction.isM() ? WEST : null;
        }
        @Override
        public CartestianCoordinate nextPossibleCartesianCoordinate(CartestianCoordinate cartestianCoordinate, Instruction instruction) {
            return instruction.isM() ? cartestianCoordinate.addX(-1) : cartestianCoordinate;
        }
    },
    SOUTH() {
        @Override
        public Direction nextDirection(Instruction instruction) {
            return instruction.isL() ? EAST : instruction.isR() ? WEST : instruction.isM() ? SOUTH : null;
        }
        @Override
        public CartestianCoordinate nextPossibleCartesianCoordinate(CartestianCoordinate cartestianCoordinate, Instruction instruction) {
            return instruction.isM() ? cartestianCoordinate.addY(-1) : cartestianCoordinate;
        }
    };
    public abstract Direction nextDirection(Instruction instruction);
    public abstract CartestianCoordinate nextPossibleCartesianCoordinate(CartestianCoordinate cartestianCoordinate, Instruction instruction);

    public static HashMap<String, Direction> directionCodeToNameMap = new HashMap<String, Direction>(){{
        put("N", Direction.NORTH);
        put("E", Direction.EAST);
        put("W", Direction.WEST);
        put("S", Direction.SOUTH);
    }};
}
