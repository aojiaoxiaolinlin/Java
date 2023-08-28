package com.lin.design_patterns.iterator;

import java.util.List;

public class StudentIteratorImpl implements StudentIterator {
    private final List<Student> list;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    // 记录遍历位置
    private int position = 0;

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        return list.get(position++);
    }
}
