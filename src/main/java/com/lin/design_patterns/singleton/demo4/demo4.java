package com.lin.design_patterns.singleton.demo4;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class demo4 {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        // 参数是一个命令
        Process process = runtime.exec("ifconfig");

        InputStream inputStream = process.getInputStream();

        byte[] bytes = new byte[1024];

        while (inputStream.read(bytes) != -1) {
            System.out.println(new String(bytes, StandardCharsets.UTF_8));
        }

    }
}
