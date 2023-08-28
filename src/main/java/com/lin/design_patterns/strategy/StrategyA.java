package com.lin.design_patterns.strategy;

public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
