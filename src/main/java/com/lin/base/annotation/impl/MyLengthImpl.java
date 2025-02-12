package com.lin.base.annotation.impl;


import com.lin.base.annotation.MyLength;

import java.lang.reflect.Field;

/**
 * Copyright(C),2023年-02月-19,霖霖
 * FileNames:FileController
 * Author:霖霖
 * Date:2023/2/19 19:10
 * Description:
 * History:
 * <author>       <time>      <version>
 * 霖霖            2023/2/19      版本号
 */
public class MyLengthImpl {
    public static String validate(Object object) throws IllegalAccessException {
        //getFields()只能访问类中声明为公有的字段,私有的字段它无法访问.getDeclaredFields()能访问类中所有的字段,与public,private,protect无关
        //getMethods()与getDeclaredMethods()区别:getMethods()只能访问类中声明为公有的方法,私有的方法它无法访问,能访问从其它类继承来的公有方法.getDeclaredFields()能访问类中所有的字段,与public,private,protect无关,不能访问从其它类继承来的方法
        //getConstructors()与getDeclaredConstructors()区别:getConstructors()只能访问类中声明为public的构造函数.getDeclaredConstructors()能访问类中所有的构造函数,与public,private,protect无关
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MyLength.class)) {
                MyLength myLength = field.getAnnotation(MyLength.class);
                System.out.println("获取注解信息: "+myLength);
                field.setAccessible(true);
                //根据反射获取的对象
                if (field.get(object)==null){
                    return myLength.message();
                }
                int length = ((String) (field.get(object))).length();
                if (length<myLength.min() || length>myLength.max()){
                    return myLength.message();
                }
            }
        }
        return null;
    }
}
