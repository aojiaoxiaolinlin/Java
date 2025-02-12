package com.lin.base.jvm_study;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * Copyright(C),2023年-02月-10,霖霖
 * FileNames:FileController
 * Author:霖霖
 * Date:2023/2/10 10:36
 * Description:
 * History:
 * <author>       <time>      <version>
 * 霖霖            2023/2/10      版本号
 */
public class ReferenceKind {
    public static void main(String[] args) {
        Object o = new Object();//强引用
        WeakReference<Object> objectWeakReference = new WeakReference<Object>(o);//弱引用
        SoftReference<Object> objectSoftReference = new SoftReference<>(o);//软引用
        PhantomReference<Object> objectPhantomReference = new PhantomReference<Object>(o,null);//虚引用
    }
}
