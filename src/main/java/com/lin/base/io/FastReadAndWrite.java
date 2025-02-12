package com.lin.base.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Copyright(C),2023年-02月-12,霖霖
 * FileNames:FileController
 * Author:霖霖
 * Date:2023/2/12 11:50
 * Description:
 * History:
 * <author>       <time>      <version>
 * 霖霖            2023/2/12      版本号
 */
public class FastReadAndWrite {
    public static void fastCopy(String src,String target) throws IOException {
        /* 获得源文件的输入字节流 */
        FileInputStream fileInputStream = new FileInputStream(src);
        /* 获取输入字节流的文件通道 */
        FileChannel inputChannel = fileInputStream.getChannel();
        FileOutputStream fileOutputStream = new FileOutputStream(target);
        /* 获取目标文件的输出字节流 */
        FileChannel outputChannel = fileOutputStream.getChannel();
        /* 为缓冲区分配 1024 个字节 */
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
        while (true){
            /* 从输入通道中读取数据到缓冲区中 */
            int readEnd=inputChannel.read(buffer);
            /* read() 返回 -1 表示 EOF */
            if (readEnd==-1){
                break;
            }
            //切换读写
            buffer.flip();
            /* 把缓冲区的内容写入输出文件中 */
            outputChannel.write(buffer);
            /* 清空缓冲区 */
            buffer.clear();
        }
    }
}
