package com.lin.design_patterns.strategy;

/**
 * 环境类
 */
public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void saleManShow() {
        strategy.show();
    }
}
