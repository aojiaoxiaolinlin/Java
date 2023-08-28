package com.lin.design_patterns.flaweight;

import java.util.HashMap;
import java.util.Map;

public class BoxFactory {
    private final Map<String, AbstractBox> map;
    private static final BoxFactory INSTANCE = new BoxFactory();

    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    public AbstractBox getBox(String name) {
        return map.get(name);
    }

    public static BoxFactory getInstance() {
        return INSTANCE;
    }

}
