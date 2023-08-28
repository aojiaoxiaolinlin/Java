package com.lin.design_patterns.factory.demo4;

public class AmericanDesertFactory implements DesertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Desert createDesert() {
        return new MatchMousse();
    }
}
