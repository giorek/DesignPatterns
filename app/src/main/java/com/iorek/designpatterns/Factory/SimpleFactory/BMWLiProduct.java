package com.iorek.designpatterns.Factory.SimpleFactory;

import com.iorek.designpatterns.Util.Logger;

public class BMWLiProduct implements BMWProduct {
    @Override
    public void TellName() {
        Logger.I("BMWLiProduct");
    }
}
