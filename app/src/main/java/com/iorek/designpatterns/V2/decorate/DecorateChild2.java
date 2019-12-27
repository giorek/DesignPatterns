package com.iorek.designpatterns.V2.decorate;

import com.iorek.designpatterns.Util.Logger;

public class DecorateChild2 extends Decorate {

    public DecorateChild2(Component com) {
        super(com);
    }

    @Override
    public void componentMethod() {
        super.componentMethod();
        child2Show();
    }

    public void child2Show(){
        Logger.I(" DecorateChild2 child2Show");
    }
}
