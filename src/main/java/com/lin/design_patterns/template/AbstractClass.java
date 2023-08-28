package com.lin.design_patterns.template;

public abstract class AbstractClass {
    /**
     * 模板方法，算法步骤固定，其中个别部分会变化。
     */
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    public void pourOil() {
        System.out.println("倒油");
    }

    public void heatOil() {
        System.out.println("热油");
    }

    public abstract void pourVegetable();

    public abstract void pourSauce();

    public void fry() {
        System.out.println("炒菜");
    }
}
