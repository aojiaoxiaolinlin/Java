package com.lin.base.jvm_study;

import java.io.File;

/**
 * Copyright(C),2023年-02月-10,霖霖
 * FileNames:FileController
 * Author:霖霖
 * Date:2023/2/10 10:51
 * Description:
 * History:
 * <author>       <time>      <version>
 * 霖霖            2023/2/10      版本号
 */
public class SysFileSeparatorChar {
    public static void main(String[] args) throws InterruptedException {
        // 1.获取系统的环境文件分隔符
        System.out.println(File.separatorChar);
    }
}
