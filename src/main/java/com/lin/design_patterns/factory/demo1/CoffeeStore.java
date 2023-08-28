package com.lin.design_patterns.factory.demo1;

public class CoffeeStore {

    public Coffee orderCoffer(String type) {
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.createCoffer(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
