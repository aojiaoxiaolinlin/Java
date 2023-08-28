package com.lin.design_patterns.builder.demo1;

public class ComputerDirector {
    private final ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }
    public Computer construct(){
        builder.buildMotherboard();
        builder.buildCpu();
        builder.buildMemory();
        return builder.createComputer();
    }
}
