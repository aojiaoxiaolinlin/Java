package com.lin.base.io;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Copyright(C),2023年-02月-12,霖霖
 * FileNames:FileController
 * Author:霖霖
 * Date:2023/2/12 10:59
 * Description:
 * History:
 * <author>       <time>      <version>
 * 霖霖            2023/2/12      版本号
 */
public class IOMain {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\15898\\Desktop\\中文文本文件.txt";
        File file = new File(path);
        System.out.println(file.exists());
        BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(Paths.get(path)));
        byte[] buffer = new byte[2 * 1024];
        while ((bufferedInputStream.read(buffer, 0, buffer.length)) != -1) {
            String content = new String(buffer);
            System.out.println(content);
        }

        bufferedInputStream.close();


//        String str1 = "中文";
//        byte[] bytes = str1.getBytes(StandardCharsets.UTF_8);
//        String str2 = new String(bytes, StandardCharsets.UTF_8);
//        System.out.println(str2);

        readFileContent(file.getPath());
//        internet();

        FileInputStream fileInputStream = new FileInputStream(path);
        FileChannel fileChannel = fileInputStream.getChannel();
//      内存映射文件
//        MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 1024);

    }
    // InputStreamReader 实现从字节流解码成字符流；
    // OutputStreamWriter 实现字符流编码成为字节流。

    /**
     * @param filePath 文件路径
     *
     * @return void
     *
     * @date 2023/2/12 11:28
     * @description 读取文件内容
     */
    public static void readFileContent(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }


    public static void internet() throws IOException, URISyntaxException {
        /**InetAddress：用于表示网络上的硬件资源，即 IP 地址；
         * URL：统一资源定位符；
         *Sockets：使用 TCP 协议实现网络通信；
         * Datagram：使用 UDP 协议实现网络通信；
         */
        // InetAddress 没有公有的构造函数，只能通过静态方法来创建实例。
//        InetAddress.getByName(String host);
//        InetAddress.getByAddress(byte[] address);
        URI url = new URI("https://www.baidu.com");
        // 字节流
        InputStream inputStream = url.toURL().openStream();
        // 字符流
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();

    }

    public void test() throws IOException {
        String path = "C:\\Users\\霖霖\\Desktop\\References.txt";
        try (BufferedReader bufferedReader =
                     new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(path))))) {

        }
    }

}
