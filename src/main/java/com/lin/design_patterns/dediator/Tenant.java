package com.lin.design_patterns.dediator;

/**
 * 具体同事
 */
public class Tenant extends Person {

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 沟通
    @Override
    public void contact(String message) {
        mediator.contact(message, this);
    }

    // 获取信息
    public void getMessage(String message) {
        System.out.println("租房者收到" + name + "的信息为:" + message);
    }
}
