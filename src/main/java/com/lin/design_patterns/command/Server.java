package com.lin.design_patterns.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Server {
    private final List<Command> commands=new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void orderUp(){
        System.out.println("订单来了");
        for (Command command:commands){
            if (Objects.nonNull(command)){
                command.execute();
            }
        }
    }
}
