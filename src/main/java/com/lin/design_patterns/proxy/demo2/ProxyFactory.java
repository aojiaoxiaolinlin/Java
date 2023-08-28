package com.lin.design_patterns.proxy.demo2;

import org.lin.design_patterns.proxy.demo1.SellTickets;
import org.lin.design_patterns.proxy.demo1.TransStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代售,JDK动态代理。
 */
public class ProxyFactory {

    private final TransStation transStation = new TransStation();

    public SellTickets getProxyTickets() {
        return (SellTickets) Proxy.newProxyInstance(
                transStation.getClass().getClassLoader(),// 类加载器
                transStation.getClass().getInterfaces(),// 代理类实现的接口的字节码对象
                new InvocationHandler() {
                    /**
                     *
                     * @param o 被代理对象 proxyObject
                     * @param method 接口中的方法封装的对象
                     * @param objects 方法参数
                     * @return 方法的返回值
                     * @throws Throwable Throwable
                     */
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        System.out.println("代理收取费用");
                        return method.invoke(transStation, objects);
                    }
                });// 代理对象的处理程序
    }
}
