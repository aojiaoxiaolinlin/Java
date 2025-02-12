package com.lin.base.optional;

import java.util.Optional;

/**
 * Copyright(C),2022年-2022,霖霖
 *
 * @author 霖霖
 * @version 1.0
 * @date 2023/6/5 20:54
 * @Description
 */
public class OptionalMain {
    public static void main(String[] args) {
        // 创建一个空的Optional对象
        Optional<Object> optional = Optional.empty();

        // 依据一个非空值创建Optional，如果值为空，则抛出NullPointerException
        Student student= new Student();
        Optional<Student> optionalStudent = Optional.of(student);

        // 可接受null的Optional
        Student student1 = null;
        Optional<Student> optionalStudent1 = Optional.ofNullable(student1);

        // 判断Optional是否包对象
        System.out.println("optionalStudent.isPresent() = " + optionalStudent.isPresent());
        // 获取Optional包含的对象，若对象为空，则抛出NoSuchElementException
//        System.out.println("optionalStudent1.get() = " + optionalStudent1.get());

        // 当原student为空时，执行Consumer接口的实现代码，并返回新建的student对象:::::public T orElse(T other)
        Student student2 = optionalStudent1.orElse(new Student("霖霖", 18));
        System.out.println("student2 = " + student2);

        // 当原student为空时，返回一个由Supplier接口生成的对象::::public T orElseGet(Supplier<? extends T> other)
        Student student3 = optionalStudent1.orElseGet(() -> new Student("霖霖", 18));
        System.out.println("student3 = " + student3);

        // 当原student为空时，抛出一个由Supplier接口生成的异常::::public <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X
//        Student student4 = optionalStudent1.orElseThrow(() -> new RuntimeException("student1为空"));

        Student student4 = new Student("霖霖", 18);
        // 过滤
        Optional<Student> student41 = Optional.ofNullable(student4);
        student41.filter(student5 -> student5.getAge() >= 18).ifPresent(student5 -> System.out.println("student5 = " + student5));

        // 映射
        Optional<Student> student42 = Optional.ofNullable(student4);
        student42.map(x->x.getAge()+2).ifPresent(System.out::println);


    }
}
