package com.lin.design_patterns.chain_of_responsibility;

public class Manager extends Handler {
    public Manager() {
        super(NUM_ONE, NUM_THREE);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        System.out.println("小组长审批同意！");
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天，" + "原因:" + leaveRequest.getContent());
    }
}
