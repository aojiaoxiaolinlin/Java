package com.lin.design_patterns.Visitor;

public interface AnimalVisitor {
    void visit(Cat cat);
    void visit(Dog dog);
}
