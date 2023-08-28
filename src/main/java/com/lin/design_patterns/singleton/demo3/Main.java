package com.lin.design_patterns.singleton.demo3;

public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance1 == instance);
    }
}
