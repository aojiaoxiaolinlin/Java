package com.lin.design_patterns.factory.demo2;

public class CoffeeStore {

    public Coffee orderCoffer(String type) {
        Coffee coffer = SimpleCoffeeFactory.createCoffer(type);
        coffer.addMilk();
        coffer.addSugar();
        return coffer;
    }
}
