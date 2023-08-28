package com.lin.design_patterns.dediator;

/**
 * 抽象同事
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    public abstract void contact(String message);
}
