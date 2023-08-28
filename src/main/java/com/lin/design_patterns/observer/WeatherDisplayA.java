package com.lin.design_patterns.observer;

public class WeatherDisplayA implements Observer {
    @Override
    public void update(String message) {
        System.out.println("观察者A观测到天气信息：" + message);
    }
}
