package com.lin.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Copyright(C),2023年-02月-19,霖霖
 * FileNames:FileController
 * Author:霖霖
 * Date:2023/2/19 19:05
 * Description:
 * History:
 * <author>       <time>      <version>
 * 霖霖            2023/2/19      版本号
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface TestAnnotation {
    String value() default "";
}
