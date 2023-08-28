package com.lin.design_patterns.builder.demo1;

/**
 * 建造者模式适用于需要创建复杂对象，且对象的构建过程中存在多个可选组件或步骤的情况。通过将对象的构建过程分解为多个步骤，每个步骤由一个特定的构建者来负责，可以使得构建过程更加清晰、灵活，同时可以避免构造器参数的过于复杂。
 * 以下是建造者模式的一些关键要点：
 * 产品类（Product）： 表示正在构建的复杂对象，它通常包含多个属性。
 * 抽象建造者（Builder）： 定义了构建产品的接口，包括各个构建步骤的方法。
 * 具体建造者（Concrete Builder）： 实现了抽象建造者接口，负责实际的构建步骤，并提供获取最终产品的方法。
 * 指挥者（Director）： 负责调用具体建造者的方法来构建产品，可以根据特定的构建步骤顺序来创建不同的产品表示。
 */
public abstract class ComputerBuilder {

    public Computer computer = new Computer();

    public abstract void buildMotherboard();

    public abstract void buildCpu();

    public abstract void buildMemory();

    public abstract Computer createComputer();
}
