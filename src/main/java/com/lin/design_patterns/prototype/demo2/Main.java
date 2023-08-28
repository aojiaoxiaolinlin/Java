package com.lin.design_patterns.prototype.demo2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        citation.setName("张三");
        Citation c2 = citation.clone();
        c2.setName("李四");
        citation.show();
        c2.show();
    }
}
