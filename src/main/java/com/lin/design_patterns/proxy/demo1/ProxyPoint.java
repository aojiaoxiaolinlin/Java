package com.lin.design_patterns.proxy.demo1;

/**
 * 代售
 */
public class ProxyPoint implements SellTickets{
    private final TransStation transStation = new TransStation();
    @Override
    public void sell() {
        System.out.println("代售点收取服务费用");
        transStation.sell();
    }
}
