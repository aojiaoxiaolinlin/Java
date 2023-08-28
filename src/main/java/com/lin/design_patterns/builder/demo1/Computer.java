package com.lin.design_patterns.builder.demo1;

public class Computer {
    private String motherboard;
    private String cpu;
    private String memory;

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
               "motherboard='" + motherboard + '\'' +
               ", cpu='" + cpu + '\'' +
               ", memory='" + memory + '\'' +
               '}';
    }
}
