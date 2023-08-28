package com.lin.design_patterns.command;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setId(1);
        order1.setFoodDir("food1", 2);
        order1.setFoodDir("food2", 3);

        Order order2 = new Order();

        order2.setId(5);
        order2.setFoodDir("food1", 4);
        order2.setFoodDir("food2", 5);
        order2.setFoodDir("food3", 6);

        SeniorChef seniorChef = new SeniorChef();

        OrderCommand orderCommand1 = new OrderCommand(order1, seniorChef);
        OrderCommand orderCommand2 = new OrderCommand(order2, seniorChef);
        Server server = new Server();
        server.addCommand(orderCommand1);
        server.addCommand(orderCommand2);
        server.orderUp();
    }
}
