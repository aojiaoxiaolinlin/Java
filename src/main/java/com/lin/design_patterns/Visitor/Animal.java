package com.lin.design_patterns.Visitor;

public interface Animal {
    void accept(AnimalVisitor animalVisitor);
}
