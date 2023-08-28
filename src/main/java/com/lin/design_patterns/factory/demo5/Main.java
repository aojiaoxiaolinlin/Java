package com.lin.design_patterns.factory.demo5;

public class Main {
    public static void main(String[] args) {
        Coffee american = CofferFactory.createCoffee("american");
        System.out.println(american.getName());
        Coffee latter = CofferFactory.createCoffee("latter");
        System.out.println(latter.getName());
    }
}
