package com.lin.design_patterns.dediator;

public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void contact(String message) {
        mediator.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("房主收到" + name + "的信息为:" + message);
    }
}
