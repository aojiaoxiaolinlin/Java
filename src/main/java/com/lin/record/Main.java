package com.lin.record;

public class Main {
    public static void main(String[] args) {
        // 创建后不能再修改
        DataClass dataRecorder = new DataClass(100, "我是大坏蛋");
        System.out.println("dataRecorder.code() = " + dataRecorder.code());
        System.out.println("dataRecorder.message() = " + dataRecorder.message());
    }
}
