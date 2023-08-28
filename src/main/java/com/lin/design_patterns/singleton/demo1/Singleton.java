package com.lin.design_patterns.singleton.demo1;

/**
 * 双重校验-懒汉式
 */
public class Singleton {
    private Singleton() {
    }

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
