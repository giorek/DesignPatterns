package com.iorek.designpatterns.v3.state;

public abstract class BaseState {
    public MyContext context;

    /*public MyContext setContext(MyContext context){
        this.context = context;
        return context;
    }*/

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();

}
