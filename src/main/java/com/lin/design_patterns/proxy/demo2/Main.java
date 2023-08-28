package com.lin.design_patterns.proxy.demo2;

public class Main {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyTickets();

        proxyObject.sell();

        System.out.println(proxyObject.getClass().getName());
    }
}
