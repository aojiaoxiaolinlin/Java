package com.lin.design_patterns.builder.demo2;

public class Computer {

    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.gpu=builder.gpu;
        this.motherboard=builder.motherboard;
        this.memory=builder.memory;
        this.screen=builder.screen;
        this.hardDisk=builder.hardDisk;
        this.heatSink=builder.heatSink;
    }

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
    public static class Builder{
        private String cpu;
        private String motherboard;
        private String memory;

        private String gpu;

        private String screen;

        private String hardDisk;

        private String heatSink;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Builder setMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder setHardDisk(String hardDisk) {
            this.hardDisk = hardDisk;
            return this;
        }

        public Builder setHeatSink(String heatSink) {
            this.heatSink = heatSink;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
