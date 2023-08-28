package com.lin.design_patterns.iterator;

/**
 * 抽象迭代器
 */
public interface StudentIterator {
    boolean hasNext();
    Student next();
}
