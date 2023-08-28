package com.lin.design_patterns.factory.demo3;


public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {
        Coffee coffer = coffeeFactory.crateCoffee();
        coffer.addMilk();
        coffer.addSugar();
        return coffer;
    }
}
