package com.lin.design_patterns.adapter.demo1;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.readSD(new SDCardImpl()));
        System.out.println("--------------------------------");
        System.out.println(computer.readSD(new SDAdapterTF()));
    }
}
