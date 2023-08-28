package com.lin.design_patterns.interpreter;

public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        // 返回变量的值
        return context.getValue(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
