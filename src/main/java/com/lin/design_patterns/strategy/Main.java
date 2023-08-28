package com.lin.design_patterns.strategy;

public class Main {
    public static void main(String[] args) {
        // 春节来了
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.saleManShow();

        salesMan.setStrategy(new StrategyB());
        salesMan.saleManShow();

        salesMan.setStrategy(new StrategyC());
        salesMan.saleManShow();
    }
}
