package com.lin.design_patterns.adapter.demo2;

/**
 * 对象适配器
 */
public class SDAdapterTF implements SDCard {
    private final TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("适配器read");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String content) {
        System.out.println("适配器write");
        tfCard.writeTF(content);
    }
}
