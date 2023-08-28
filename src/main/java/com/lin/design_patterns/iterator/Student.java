package com.lin.design_patterns.iterator;

public class Student {
    private final String name;
    private final String number;

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", number='" + number + '\'' +
               '}';
    }
}
