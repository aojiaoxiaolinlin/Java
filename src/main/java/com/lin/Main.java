package com.lin;

public class Main {
    public static void main(String[] args) {
        System.out.println("霖霖，您好！");
        System.out.printf("""
                生命值：%s
                攻击力：%s
                防御力：%s
                %n""", 1, 2, 3);

        System.out.printf("""
                          生命值：%s
                          攻击力：%s
                          防御力：%s
                          %n%n""", 1, 2, 3);
        String result = "变量";

        System.out.println("""
                我是${result}""");

        String name = "Alice";
        int age = 30;

        String message = """
                Hello, %s!
                You are %s years old.
                Have a great day!
                """.formatted(name, age);

        System.out.println(message);

    }


}