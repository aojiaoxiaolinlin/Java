package com.lin.design_patterns.proxy.demo3;

public class Main {
    public static void main(String[] args) {
        TransStation proxyObject = new ProxyFactory().getProxyObject();
        proxyObject.sell();
    }
}
