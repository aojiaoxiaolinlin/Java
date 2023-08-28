package com.lin.design_patterns.command;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private int id;
    private final Map<String,Integer> foodDir= new HashMap<>();

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFoodDir(String name,Integer number) {
        foodDir.put(name,number);
    }
}
