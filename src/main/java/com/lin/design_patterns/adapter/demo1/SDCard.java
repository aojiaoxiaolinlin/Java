package com.lin.design_patterns.adapter.demo1;

/**
 * 目标接口
 */
public interface SDCard {
    String readSD();

    void writeSD(String content);
}
