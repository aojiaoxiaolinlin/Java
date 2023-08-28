package com.lin.design_patterns.prototype.demo3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Citation citation = new Citation();

        Student student = new Student();
        student.setName("李四");
        citation.setStudent(student);

        //使用对象流深克隆
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("/home/intasect/intasect/object.txt"));
        objectOutputStream.writeObject(citation);
        objectOutputStream.close();

        // 创建对象输入流
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("/home/intasect/intasect/object.txt"));

        Citation citation1 = (Citation) objectInputStream.readObject();

        objectInputStream.close();

        Student student1 = citation1.getStudent();
        student1.setName("张三");
        citation1.setStudent(student1);


        citation1.show();
        citation.show();
    }
}
