package com.lin.design_patterns.builder.demo1;

public class IntelComputerBuilder extends ComputerBuilder {


    @Override
    public void buildMotherboard() {
        computer.setMotherboard("吹雪Z701");
    }

    @Override
    public void buildCpu() {
        computer.setCpu("I9-13900F");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("芝奇皇家戟DDR5");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
