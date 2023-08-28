package com.lin.design_patterns.command;

import java.util.Set;

public class OrderCommand implements Command {
    private final Order order;
    private final SeniorChef seniorChef;

    public OrderCommand(Order order, SeniorChef seniorChef) {
        this.order = order;
        this.seniorChef = seniorChef;
    }

    @Override
    public void execute() {
        System.out.println(order.getId() + "桌的订单");
        Set<String> keys = order.getFoodDir().keySet();
        for (String key : keys) {
            seniorChef.makeFood(key, order.getFoodDir().get(key));
        }
        System.out.println(order.getId() + "的订单完成");
    }
}
