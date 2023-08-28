package com.lin.design_patterns.strategy;

public class StrategyB implements Strategy {
    @Override
    public void show() {
        System.out.println("满100减50");
    }
}
