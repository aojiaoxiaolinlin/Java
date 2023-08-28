package com.lin.design_patterns.factory.demo4;

public class Main {
    public static void main(String[] args) {
        ItalyDesertFactory italyDesertFactory = new ItalyDesertFactory();

        Coffee coffee = italyDesertFactory.createCoffee();
        Desert desert = italyDesertFactory.createDesert();

        System.out.println(coffee.getName());
        desert.show();
    }
}
