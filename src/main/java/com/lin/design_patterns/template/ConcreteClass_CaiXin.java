package com.lin.design_patterns.template;

public class ConcreteClass_CaiXin extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("调料蒜蓉");
    }
}
