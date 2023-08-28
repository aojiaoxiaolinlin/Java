package com.lin.design_patterns.proxy.demo1;

public class TransStation implements SellTickets {

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
