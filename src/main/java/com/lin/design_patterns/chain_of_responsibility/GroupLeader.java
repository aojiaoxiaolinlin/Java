package com.lin.design_patterns.chain_of_responsibility;

import org.jetbrains.annotations.NotNull;

public class GroupLeader extends Handler {
    public GroupLeader() {
        super(0, NUM_ONE);
    }

    @Override
    protected void handleRequest(@NotNull LeaveRequest leaveRequest) {
        System.out.println("小组长审批同意！");
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天，" + "原因:" + leaveRequest.getContent());
    }
}
