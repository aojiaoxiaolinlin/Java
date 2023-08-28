package com.lin.design_patterns.builder.demo3;

public class Main {
    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .cpu("x86")
                .memory("1024")
                .hardDisk("致态")
                .heatSink("利民")
                .gpu("GPU")
                .motherboard("吹雪");
        System.out.println(computer);
    }
}
