package com.iorek.designpatterns.behavior.Command;

import com.iorek.designpatterns.behavior.Command.v1.CommandImplOne;
import com.iorek.designpatterns.behavior.Command.v1.ICommand;
import com.iorek.designpatterns.behavior.Command.v1.Invoker;
import com.iorek.designpatterns.behavior.Command.v1.demo.Custom;

/**
 * 外部调用
 */
public class CommandCaller {
    /**
     * 供外部调用
     */
    public void call(){
        ICommand command = new CommandImplOne();
        Invoker invoker = new Invoker(command);
        invoker.Invoke();
    }

    public void orderFood(){
        Custom custom = new Custom();
        custom.orderFood();
    }
}
