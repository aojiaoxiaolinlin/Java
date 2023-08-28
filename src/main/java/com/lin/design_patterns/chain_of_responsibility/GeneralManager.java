package com.lin.design_patterns.chain_of_responsibility;

public class GeneralManager extends Handler {
    public GeneralManager() {
        super(NUM_THREE, NUM_SEVEN);
    }

    @Override
    protected void handleRequest(LeaveRequest leaveRequest) {
        System.out.println("总经理审批通过");
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天，" + "原因:" + leaveRequest.getContent());
    }
}
