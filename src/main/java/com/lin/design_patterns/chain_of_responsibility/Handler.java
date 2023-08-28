package com.lin.design_patterns.chain_of_responsibility;

import java.util.Objects;

/**
 * 抽象处理者
 */
public abstract class Handler {
    protected static final int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    // 领导处理请假参数区间
    private final int numStart;
    private final int numEnd;

    // 声明后继者，上级领导
    private Handler nextHandler;

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    protected abstract void handleRequest(LeaveRequest leaveRequest);

    // 提交请假条
    public final void commitRequest(LeaveRequest leaveRequest) {
        if (this.nextHandler != null && leaveRequest.num > this.numEnd) {
            this.nextHandler.commitRequest(leaveRequest);
        } else {
            this.handleRequest(leaveRequest);
            System.out.println("流程结束");
        }
    }
}
