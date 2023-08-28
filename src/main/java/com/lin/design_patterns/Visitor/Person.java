package com.lin.design_patterns.Visitor;

public class Person implements AnimalVisitor {
    @Override
    public void visit(Cat cat) {
        System.out.println("主人摸Cat");
    }

    @Override
    public void visit(Dog dog) {
        System.out.println("主人摸Dog");
    }
}
