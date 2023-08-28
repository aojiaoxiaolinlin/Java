package com.lin.design_patterns.decorator;

public class Main {
    public static void main(String[] args) {
        SimpleCoffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription());
        System.out.println(simpleCoffee.cost());

        MilkDecorator milkDecorator = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkDecorator.getDescription());
        System.out.println(milkDecorator.cost());

        ChocolateDecorator chocolateDecorator = new ChocolateDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(chocolateDecorator.getDescription());
        System.out.println(chocolateDecorator.cost());
    }
}
