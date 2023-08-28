package com.lin.design_patterns.decorator;

public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", ChocolateDecorator";
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.0;
    }
}
