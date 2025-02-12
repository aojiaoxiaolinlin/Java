package com.lin.base.jvm_study;


/**
 * Copyright(C),2023年-02月-20,霖霖
 * FileNames:FileController
 * Author:霖霖
 * Date:2023/2/20 13:26
 * Description:
 * History:
 * <author>       <time>      <version>
 * 霖霖            2023/2/20      版本号
 */
public class StringConstantPool {

    public static void main(String[] args) {
        String s1 = "Hr";
        String s2 = "Hr";
        char[] c1 = {'H', 'r'};
        System.out.println("s1 == s2 = " + (s1 == s2));
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        String s3 = new String("Hr");
        String s4 = new String("Hr");
        System.out.println("s3 == s4 = " + (s3 == s4));
        System.out.println("s3.equals(s4) = " + s3.equals(s4));
        System.out.println("s3.hashCode() == s4.hashCode() = " + (s3.hashCode() == s4.hashCode()));

        System.out.println("c1.hashCode() == s1.hashCode() = " + (c1.hashCode() == s1.hashCode()));
    }
}
