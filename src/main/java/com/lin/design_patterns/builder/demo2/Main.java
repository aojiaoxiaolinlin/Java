package com.lin.design_patterns.builder.demo2;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder().setCpu("cpu")
                .setScreen("screen")
                .setHeatSink("利民")
                .setHardDisk("致态")
                .setGpu("4090")
                .setMotherboard("吹雪")
                .setMemory("皇家戟")
                .build();

        System.out.println(computer);
    }
}
