package com.lin.design_patterns.proxy.demo3;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * CGLIB代理，jdK9以上添加虚拟机参数--add-opens java.base/java.lang=ALL-UNNAMED，以便未命名模块访问java.lang
 * 有接口使用jdk代理，无接口使用cglib代理
 * jdk17已不推荐使用了，使用byte Buddy
 */
public class ProxyFactory {

    private final TransStation transStation = new TransStation();

    public TransStation getProxyObject() {
        // 创建Enhancer对象 类属于Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TransStation.class);
        // 设置回调函数
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("执行代理方法");
            return methodProxy.invokeSuper(o, objects);
//            return method.invoke(transStation, objects);
        });
        // 创建代理对象，代理对象是被代理对象的子类
        return (TransStation) enhancer.create();
    }
}
