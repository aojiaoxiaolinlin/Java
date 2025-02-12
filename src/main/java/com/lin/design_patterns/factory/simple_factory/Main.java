package com.lin.design_patterns.factory.simple_factory;

public class Main {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();

        Coffee coffer = coffeeStore.orderCoffer("Latter");
        System.out.println(coffer.getName());
    }
}
