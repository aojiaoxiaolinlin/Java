package com.lin.design_patterns.builder.demo1;

public class Main {
    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector(new BasicComputerBuilder());
        Computer computer = computerDirector.construct();
        System.out.println(computer);

        ComputerDirector computerDirector1 = new ComputerDirector(new IntelComputerBuilder());
        System.out.println(computerDirector1.construct());
    }
}
