package com.lin.design_patterns.iterator;

/**
 * 容器接口
 */
public interface StudentAggregate {
    void addStudent(Student student);
    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
