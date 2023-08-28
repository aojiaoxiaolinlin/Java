package com.lin.design_patterns.factory.demo3;

public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee crateCoffee() {
        return new AmericanCoffee();
    }
}
