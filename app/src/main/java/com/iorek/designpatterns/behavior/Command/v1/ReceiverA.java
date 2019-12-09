package com.iorek.designpatterns.behavior.Command.v1;

import com.iorek.designpatterns.Util.Logger;

/**
 * 具体的指令接受者
 */
public class ReceiverA {
    private String TAG = ReceiverA.class.getSimpleName();
    public void action(){
        Logger.I(TAG,"具体接收指令处");
    }
}
