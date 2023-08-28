package com.lin.design_patterns.combination;

public class MenuItem extends MenuComponent {
    public MenuItem(String name, int level) {
        super(name, level);
    }
    public void printName() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
