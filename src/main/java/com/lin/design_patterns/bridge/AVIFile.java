package com.lin.design_patterns.bridge;

public class AVIFile implements VideoFile {
    @Override
    public void decode(String filePath) {
        System.out.println("decode AVI file " + filePath);
    }
}
