package com.lin.design_patterns.combination;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private final List<MenuComponent> children = new ArrayList<>();

    public Menu(String name, int level) {
        super(name, level);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        children.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        children.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return children.get(index);
    }

    @Override
    public void printName() {
        // 打印菜单名称
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        // 打印菜单后子菜单项名称
        for (MenuComponent child : children) {
            child.printName();
        }

    }


}
