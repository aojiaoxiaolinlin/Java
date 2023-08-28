package com.lin.design_patterns.facade;

/**
 * 外观类
 */
public class SmartAppliancesFacade {
    private final Light light;
    private final TV tv;
    private final AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void say(String message) {
        if ("打开".equals(message)) {
            on();
        } else if ("关闭".equals(message)) {
            off();
        } else {
            System.out.println("命令错误");
        }
    }

    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }
}
