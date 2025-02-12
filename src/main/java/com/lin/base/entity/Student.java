package com.lin.base.entity;


import com.lin.base.annotation.MyLength;

import java.io.Serializable;

/**
 * Copyright(C),2022年-11月-30,霖霖
 * FileNames:FileController
 * Author:霖霖
 * Date:2022/11/30 10:26
 * Description:
 * History:
 * <author>       <time>      <version>
 * 霖霖            2022/11/30      版本号
 */
public class Student implements Serializable {
    @MyLength(min = 2, max = 5, message = "你的长度错了")
    String name;
    int age;
    public Student(){}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
