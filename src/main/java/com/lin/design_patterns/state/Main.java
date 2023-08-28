package com.lin.design_patterns.state;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setLiftState(new ClosingState());
        context.open();
        context.run();
        context.close();
        context.stop();
    }
}
