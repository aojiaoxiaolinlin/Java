package com.lin.base.lamda;


import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

/**
 * @Author 霖霖
 * @Date 2025/2/12 23:02
 * @Description
 */
public class FunctionParameter {

    public static void main(String[] args) {
        //     加个100
        System.out.println("exec((n) -> n + 100) = " + exec((n) -> {
            System.out.println("加法处理中");
            return n + 100;
        }));
        System.out.println("exec(n->n*100) = " + exec(n -> n * 100));
    }

    public static <R> R exec(@NotNull Function<Integer, R> func) {
        System.out.println("共同处理");
        int num = 100;
        R result = func.apply(num);
        System.out.println("后共同处理");
        return result;
    }
}
