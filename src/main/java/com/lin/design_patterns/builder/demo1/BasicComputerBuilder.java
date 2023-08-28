package com.lin.design_patterns.builder.demo1;

public class BasicComputerBuilder extends ComputerBuilder {

    @Override
    public void buildMotherboard() {
        computer.setMotherboard("Basic Motherboard");
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Basic CPU");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("Basic Memory");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }

}
