package com.lin.base.enum_study;

/**
 * Copyright(C),2023年-02月-15,霖霖
 * FileNames:FileController
 * Author:霖霖
 * Date:2023/2/15 18:06
 * Description:
 * History:
 * <author>       <time>      <version>
 * 霖霖            2023/2/15      版本号
 */
public class TestDemo02 {
    public static void main(String[] args) {
        Color[] values = Color.values();
        System.out.println("获取枚举类型所有成员");
        for (Color value : values) {
            System.out.println(value.name());
        }
        System.out.println("获取一个枚举成员");
        Color red = Color.valueOf("RED");
        System.out.println(red.name());

        System.out.println("比较枚举成员");
        System.out.println("相等： "+red.compareTo(Color.RED));
        System.out.println("不相等："+red.compareTo(Color.GREEN));
        System.out.println("获取枚举成员的索引位置");
        for (Color value : values) {
            System.out.println("索引"+value.ordinal()+","+"值:"+ value);
        }
    }
}
