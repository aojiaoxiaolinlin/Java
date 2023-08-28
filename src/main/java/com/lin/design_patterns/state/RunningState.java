package com.lin.design_patterns.state;

public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {
        this.context.setLiftState(Context.closeState);
        this.context.close();
    }

    @Override
    public void run() {
        System.out.println("电梯运行中...");
    }

    @Override
    public void stop() {
        this.context.setLiftState(Context.stopState);
        this.context.stop();
    }
}
