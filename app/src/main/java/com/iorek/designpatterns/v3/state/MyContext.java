package com.iorek.designpatterns.v3.state;

public class MyContext {
    public static final int STATE_OPEN = 1;
    public static final int STATE_CLOSE = 2;
    public static final int STATE_RUN = 3;
    public static final int STATE_STOP = 4;

    private BaseState curState;

    public MyContext(){

    }

    /*public MyContext(BaseState baseState){
        this.curState = baseState;
    }*/

    public void setState(BaseState baseState){
        this.curState = baseState;
    }

    public void open(){
        curState.open();
    }

    public void close(){
        curState.close();
    }

    public void run(){
        curState.run();
    }

    public void stop(){
        curState.stop();
    }
}
