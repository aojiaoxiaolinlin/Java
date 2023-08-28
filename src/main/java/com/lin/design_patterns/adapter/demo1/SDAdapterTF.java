package com.lin.design_patterns.adapter.demo1;

/**
 * 类适配器
 * 适配器继承被适配者，实现目标接口。
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("适配器read");
        return readTF();
    }

    @Override
    public void writeSD(String content) {
        System.out.println("适配器write");
        writeTF(content);
    }
}
