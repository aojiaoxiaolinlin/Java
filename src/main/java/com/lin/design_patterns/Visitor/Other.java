package com.lin.design_patterns.Visitor;

public class Other implements AnimalVisitor {
    @Override
    public void visit(Cat cat) {
        System.out.println("其他人摸Cat");
    }

    @Override
    public void visit(Dog dog) {
        System.out.println("其他人摸Dog");
    }
}
