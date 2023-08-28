package com.lin.design_patterns.adapter.demo2;

/**
 * 被适配者
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "读TFCard数据";
    }

    @Override
    public void writeTF(String content) {
        System.out.println("写TFCard数据" + content);
    }
}
