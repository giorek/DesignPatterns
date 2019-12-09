package com.iorek.designpatterns.behavior.Command.v1;

import com.iorek.designpatterns.Util.Logger;

/**
 * 命令接口的具体实现
 */
public class CommandImplOne implements ICommand {
    private String TAG = CommandImplOne.class.getSimpleName();
    private ReceiverA receiver;
    public CommandImplOne(){
        receiver = new ReceiverA();
    }
    @Override
    public void action() {
        Logger.I(TAG,"具体命令的实现者");
        receiver.action();
    }
}
