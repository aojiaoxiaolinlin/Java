package com.lin.design_patterns.Visitor;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        AnimalVisitor person = new Person();

        Home home = new Home();
        home.addAnimal(cat);
        home.addAnimal(dog);
        home.action(person);
        home.action(new Other());
    }
}
