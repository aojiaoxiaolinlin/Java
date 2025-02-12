package com.lin.design_patterns.factory.simple_factory;

/**
 * 增加工厂和产品、工厂和商店的耦合
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffer(String type) {
        if ("american".equals(type))
            return new AmericanCoffee();
        else if ("Latter".equals(type))
            return new LatterCoffee();
        else
            throw new RuntimeException("没有指定的类型对象");
    }
}
