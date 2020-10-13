package com.iorek.designpatterns.v3.state;

public class StateClient {
    public void test(){
        MyContext context = new MyContext();
        OpenState openState = new OpenState();
        StopState stopState = new StopState();

        context.setState(openState);
        context.open();

        context.setState(stopState);
        context.stop();
    }
}
