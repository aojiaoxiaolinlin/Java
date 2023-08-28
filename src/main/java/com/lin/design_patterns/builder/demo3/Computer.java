package com.lin.design_patterns.builder.demo3;

public class Computer {
    private String cpu;
    private String motherboard;
    private String memory;

    private String gpu;

    private String screen;

    private String hardDisk;

    private String heatSink;

    @Override
    public String toString() {
        return "Computer{" +
               "cpu='" + cpu + '\'' +
               ", motherboard='" + motherboard + '\'' +
               ", memory='" + memory + '\'' +
               ", gpu='" + gpu + '\'' +
               ", screen='" + screen + '\'' +
               ", hardDisk='" + hardDisk + '\'' +
               ", heatSink='" + heatSink + '\'' +
               '}';
    }

    public Computer cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public Computer memory(String memory) {
        this.memory = memory;
        return this;
    }

    public Computer hardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }

    public Computer heatSink(String heatSink) {
        this.heatSink = heatSink;
        return this;
    }

    public Computer motherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public Computer gpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public Computer screen(String screen) {
        this.screen = screen;
        return this;
    }

    // 构造
    public static Computer builder() {
        return new Computer();
    }


}
