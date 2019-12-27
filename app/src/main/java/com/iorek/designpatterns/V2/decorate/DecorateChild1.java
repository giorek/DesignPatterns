package com.iorek.designpatterns.V2.decorate;

import com.iorek.designpatterns.Util.Logger;

public class DecorateChild1 extends Decorate {

    public DecorateChild1(Component com) {
        super(com);
    }

    @Override
    public void componentMethod() {
        super.componentMethod();
        childShow();
    }

    public void childShow(){
        Logger.I(" DecorateChild1 childShow");
    }
}
