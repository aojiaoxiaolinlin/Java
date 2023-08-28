package com.lin.design_patterns.factory.demo2;

public class Main {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();

        Coffee coffer = coffeeStore.orderCoffer("Latter");
        System.out.println(coffer.getName());
    }
}
