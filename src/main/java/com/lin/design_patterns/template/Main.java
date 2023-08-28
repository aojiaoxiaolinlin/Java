package com.lin.design_patterns.template;

/**
 * 反向控制
 */
public class Main {
    public static void main(String[] args) {
        ConcreteClass_BaoCai concreteClassBaoCai = new ConcreteClass_BaoCai();
        concreteClassBaoCai.cookProcess();
        ConcreteClass_CaiXin concreteClassCaiXin = new ConcreteClass_CaiXin();
        concreteClassCaiXin.cookProcess();
    }
}
