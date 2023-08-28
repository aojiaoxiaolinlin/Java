package com.lin.design_patterns.prototype.demo1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
        System.out.println("原型对象和克隆对象：" + (realizetype == clone)); // false不是同一个对象
    }
}
