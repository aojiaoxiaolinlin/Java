package com.lin.design_patterns.factory.demo3;

/**
 * 1.知道具体的工厂就可以创建对象
 * 2.只需要继承就能添加新的商品
 */
public interface CoffeeFactory {
    Coffee crateCoffee();
}
