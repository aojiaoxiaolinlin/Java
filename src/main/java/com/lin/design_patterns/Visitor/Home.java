package com.lin.design_patterns.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 */
public class Home {
    private final List<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void action(AnimalVisitor animalVisitor) {
        for (Animal animal : animals) {
            animal.accept(animalVisitor);
        }
    }
}
