package com.lin.design_patterns.interpreter;

public class Minus implements Expression {
    private final Expression left;
    private final Expression right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        // 左表达式和右表达式结果相加
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "-" + right.toString() + ")";
    }
}
