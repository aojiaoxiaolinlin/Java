package com.lin.design_patterns.state;

public class StoppingState extends LiftState {
    @Override
    public void open() {
        this.context.setLiftState(Context.openState);
        context.open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
        System.out.println("电梯停止");
    }
}
