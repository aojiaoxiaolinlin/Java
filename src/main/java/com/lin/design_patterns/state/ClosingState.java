package com.lin.design_patterns.state;

public class ClosingState extends LiftState {
    @Override
    public void open() {
        this.context.setLiftState(Context.openState);
        context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯关闭");
    }

    @Override
    public void run() {
        this.context.setLiftState(Context.runState);
        this.context.run();
    }

    @Override
    public void stop() {
        this.context.setLiftState(Context.stopState);
        this.context.stop();
    }
}
