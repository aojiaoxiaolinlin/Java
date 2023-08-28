package com.lin.design_patterns.factory.demo4;

/**
 * 抽象工厂，用于生产一些列产品（产品簇，相关联的产品）。
 * 不利于增加产品簇中的产品。
 */
public interface DesertFactory {

    /**
     * 生产coffee
     *
     * @return Coffee
     */
    Coffee createCoffee();

    /**
     * 生产甜品
     *
     * @return Desert
     */
    Desert createDesert();
}
