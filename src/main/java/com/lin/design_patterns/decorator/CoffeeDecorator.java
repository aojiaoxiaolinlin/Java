package com.lin.design_patterns.decorator;

/**
 * 装饰器需要持有被装饰的对象
 * 组件接口（Component Interface）： 定义了被装饰者和装饰者的共同接口，以确保装饰者和被装饰者之间的一致性。
 * 具体组件（Concrete Component）： 实现了组件接口，是被装饰者的实际对象。
 * 装饰者（Decorator）： 实现了组件接口，并持有一个被装饰者的引用。它可以在被装饰者的基础上添加新的功能。
 * 具体装饰者（Concrete Decorator）： 扩展了装饰者，并实现了具体的装饰逻辑。
 */
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
