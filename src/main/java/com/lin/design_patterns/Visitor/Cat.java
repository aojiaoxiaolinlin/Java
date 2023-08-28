package com.lin.design_patterns.Visitor;

public class Cat implements Animal{
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(this);
    }
}
