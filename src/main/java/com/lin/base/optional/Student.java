package com.lin.base.optional;

/**
 * Copyright(C),2022年-2022,霖霖
 *
 * @author 霖霖
 * @version 1.0
 * @date 2023/6/5 20:51
 * @Description Optional类的使用

 */
public class Student {
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
