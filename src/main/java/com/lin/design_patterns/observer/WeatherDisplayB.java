package com.lin.design_patterns.observer;

public class WeatherDisplayB implements Observer {
    @Override
    public void update(String message) {
        System.out.println("观察者B观测到天气信息：" + message);
    }
}
