package com.lin.design_patterns.state;

public class OpeningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯开启");
    }

    @Override
    public void close() {
        context.setLiftState(Context.closeState);
        context.close();
    }

    @Override
    public void run() {
        context.setLiftState(Context.runState);
        context.run();
    }

    @Override
    public void stop() {

    }
}
