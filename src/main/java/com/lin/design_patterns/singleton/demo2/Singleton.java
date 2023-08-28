package com.lin.design_patterns.singleton.demo2;

/**
 * 静态类部类实现
 */
public class Singleton {
    private Singleton() {}

    private static class SingletonHolder {
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
