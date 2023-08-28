package com.lin.design_patterns.flaweight;

/**
 * 重复使用对象时使用。
 */
public class Main {
    public static void main(String[] args) {
        BoxFactory instance = BoxFactory.getInstance();
        instance.getBox("I").display("red");
        instance.getBox("L").display("blue");
        AbstractBox o1 = instance.getBox("O");
        o1.display("green");
        AbstractBox o2 = instance.getBox("O");
        o2.display("yellow");
        System.out.println(o1 == o2);
    }
}
