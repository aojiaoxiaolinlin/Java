package com.lin.design_patterns.prototype.demo3;

import java.io.Serializable;

public class Citation implements Cloneable, Serializable {
    private Student student;

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(student.getName());
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Citation{" +
               "student=" + student +
               '}';
    }
}
