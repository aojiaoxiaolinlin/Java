package com.lin.design_patterns.template;

public class ConcreteClass_BaoCai extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("调料辣椒");
    }
}
