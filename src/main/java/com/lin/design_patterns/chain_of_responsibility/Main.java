package com.lin.design_patterns.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("小王", 5, "身体不舒服");
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        groupLeader.commitRequest(leaveRequest);

        groupLeader.commitRequest(new LeaveRequest("小冯", 1, "阳了"));
    }
}
