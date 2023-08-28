package com.lin.design_patterns.adapter.demo2;


public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "read SD card";
    }

    @Override
    public void writeSD(String content) {
        System.out.println("write SD card:" + content);
    }
}
