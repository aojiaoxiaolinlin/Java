package com.lin.base.annotation;

import com.lin.base.entity.Student;
import com.lin.base.annotation.impl.MyLengthImpl;

import java.lang.reflect.Field;

/**
 * Copyright(C),2023年-02月-19,霖霖
 * FileNames:FileController
 * Author:霖霖
 * Date:2023/2/19 19:19
 * Description:
 * History:
 * <author>       <time>      <version>
 * 霖霖            2023/2/19      版本号
 */
public class TestMain {
    public static void main(String[] args) throws IllegalAccessException {
        Student student = new Student();
        student.setName("l");
        System.out.println(MyLengthImpl.validate(student));

        Class<? extends Student> studentClass = student.getClass();
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName()+": "+field.get(student));
           field.set(student,"lin");//修改原来的值
           System.out.println(field.getName()+": "+field.get(student));
        }
    }
}
