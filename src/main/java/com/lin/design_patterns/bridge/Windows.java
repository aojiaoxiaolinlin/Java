package com.lin.design_patterns.bridge;

public class Windows extends OperationSystem {
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
