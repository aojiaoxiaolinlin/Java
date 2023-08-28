package com.lin.design_patterns.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境
 */
public class Context {
    // 用于存储变量和值
    private final Map<Variable, Integer> map = new HashMap<>();

    public void assign(Variable key, int value) {
        map.put(key, value);
    }

    // 获取变量的值
    public int getValue(Variable key) {
        return map.get(key);
    }

}
