package com.lin.design_patterns.bridge;

/**
 * 具体实现化类
 */
public class RMVBFile implements VideoFile {
    @Override
    public void decode(String filePath) {
        System.out.println("RMVBFile decode");
    }
}
