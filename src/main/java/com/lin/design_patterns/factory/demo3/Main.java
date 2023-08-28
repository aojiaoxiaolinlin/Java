package com.lin.design_patterns.factory.demo3;

public class Main {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();

        System.out.println(coffee.getName());
    }
}
