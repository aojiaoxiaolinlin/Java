package com.lin.design_patterns.combination;

/**
 * 用于出现树形结构数据的位置
 */
public abstract class MenuComponent {

    protected final String name;
    // 菜单组件级别
    protected final int level;

    protected MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 获取指定的子菜单
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    // 获取菜单或菜单项的名称
    public String getName() {
        return name;
    }

    // 打印菜单名称的方法
    public abstract void printName();

}
