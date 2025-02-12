package com.lin.base.math;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Copyright(C),2023年-02月-28,霖霖
 * FileNames:FileController
 * Author:霖霖
 * Date:2023/2/28 18:24
 * Description:
 * History:
 * <author>       <time>      <version>
 * 霖霖            2023/2/28      版本号
 */
public class RandomMain {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        double random = Math.random();//[0.0,1.0)
        System.out.println(random);
        Random rand = new Random();
        rand.setSeed(10);
        int randNumber = rand.nextInt(10 - 2 + 1) + 2;//(MAX-MIN+1）+MIN;
        System.out.println(randNumber);
        long randomTime = System.currentTimeMillis();
        long l = randomTime % (100 - 2) + 2;//(MAX-MIN)-MIN
        System.out.println(l);
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        int i = secureRandom.nextInt(20 - 10 + 1) + 10;// 0-9
        System.out.println(i);
        // >>> 无符号右移
        System.out.println((8 + 3) >>> 1);
    }
}
