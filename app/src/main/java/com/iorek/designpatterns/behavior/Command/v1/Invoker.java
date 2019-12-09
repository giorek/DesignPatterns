package com.iorek.designpatterns.behavior.Command.v1;

/**
 * 信息发送者
 */
public class Invoker{
    private ICommand command;

    public Invoker(ICommand command){
        this.command = command;
    }

    /**
     * 激活命令
     */
    public void Invoke(){
        if(null != command){
            command.action();
        }
    }


}
