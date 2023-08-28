package com.lin.design_patterns.bridge;

/**
 * 抽象角色，需要持有实现化角色
 */
public abstract class OperationSystem {
    protected VideoFile videoFile;

    public OperationSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
