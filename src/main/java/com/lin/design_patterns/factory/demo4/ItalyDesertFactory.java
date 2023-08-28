package com.lin.design_patterns.factory.demo4;

public class ItalyDesertFactory implements DesertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatterCoffer();
    }

    @Override
    public Desert createDesert() {
        return new Tiramisu();
    }
}
