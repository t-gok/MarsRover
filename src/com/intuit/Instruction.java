package com.intuit;

public class Instruction {
    private char instruction;

    public Instruction(char instruction) {
        this.instruction = instruction;
    }

    public boolean isL(){
        return instruction == 'L';
    }

    public boolean isR(){
        return instruction == 'R';
    }

    public boolean isM(){
        return instruction == 'M';
    }
}
