package com.lin.design_patterns.Visitor;

public class Dog implements Animal {
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(this);
    }
}
