package com.lin.base.annotation;

import java.lang.annotation.*;

/**
 * Copyright(C),2023年-02月-19,霖霖
 * FileNames:FileController
 * Author:霖霖
 * Date:2023/2/19 19:09
 * Description:
 * History:
 * <author>       <time>      <version>
 * 霖霖            2023/2/19      版本号
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyLength {
    int min();
    int max();
    String message() default "长度不符合要求";
}
