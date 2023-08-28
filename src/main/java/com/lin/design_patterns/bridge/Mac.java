package com.lin.design_patterns.bridge;

/**
 * 扩展功能，可以播放视频文件
 */
public class Mac extends OperationSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
