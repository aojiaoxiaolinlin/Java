package com.lin.design_patterns.bridge;

/**
 * 两个变化维度中的可以任意扩展一个维度，都不用修改原有系统
 *
 */
public class Main {
    public static void main(String[] args) {
        OperationSystem windows = new Windows(new RMVBFile());
        windows.play("video.rmvb");

        OperationSystem macOS = new Mac(new AVIFile());

        macOS.play("video.avi");
    }
}
