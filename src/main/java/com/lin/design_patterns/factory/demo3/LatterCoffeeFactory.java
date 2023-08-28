package com.lin.design_patterns.factory.demo3;

public class LatterCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee crateCoffee() {
        return new LatterCoffer();
    }
}
