package com.lin.design_patterns.prototype.demo1;

/**
 * Cloneable就是抽象原型
 */
public class Realizetype implements Cloneable {
    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        return (Realizetype) super.clone();
    }
}
