package com.lin.design_patterns.interpreter;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        context.assign(a, 10);
        context.assign(b, 20);
        context.assign(c, 30);
        context.assign(d, 40);

        Expression result = new Minus(a, new Plus(c, new Plus(b, d)));
        System.out.println(result);
        int interpret = result.interpret(context);
        System.out.println(interpret);

    }
}
