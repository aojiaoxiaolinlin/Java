package com.lin.design_patterns.facade;

public class Main {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();

        smartAppliancesFacade.say("打开");
        smartAppliancesFacade.say("关闭");
    }
}
