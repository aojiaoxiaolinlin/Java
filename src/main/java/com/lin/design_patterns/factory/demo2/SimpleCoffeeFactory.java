package com.lin.design_patterns.factory.demo2;

/**
 *  静态工厂
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffer(String type) {
        if ("american".equals(type))
            return new AmericanCoffee();
        else if ("Latter".equals(type))
            return new LatterCoffer();
        else
            throw new RuntimeException("没有指定的类型对象");
    }
}
