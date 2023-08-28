package com.lin.design_patterns.state;

/**
 * 环境角色
 */
public class Context {
    protected static final OpeningState openState = new OpeningState();
    protected static final ClosingState closeState = new ClosingState();
    protected static final RunningState runState = new RunningState();
    protected static final StoppingState stopState = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }
    public void open(){
        this.liftState.open();
    }
    public void close(){
        this.liftState.close();
    }
    public void run(){
        this.liftState.run();
    }
    public void stop(){
        this.liftState.stop();
    }
}
