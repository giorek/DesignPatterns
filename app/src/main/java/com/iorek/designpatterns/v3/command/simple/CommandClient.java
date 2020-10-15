package com.iorek.designpatterns.v3.command.simple;

public class CommandClient {

    public void action(){
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
