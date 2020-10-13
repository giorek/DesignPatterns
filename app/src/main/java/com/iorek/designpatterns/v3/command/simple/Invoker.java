package com.iorek.designpatterns.v3.command.simple;

public class Invoker {
    public Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
