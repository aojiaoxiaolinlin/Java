package com.lin.design_patterns.adapter.demo1;

public class Computer {
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sdCard is null");
        }
        return sdCard.readSD();
    }
}
