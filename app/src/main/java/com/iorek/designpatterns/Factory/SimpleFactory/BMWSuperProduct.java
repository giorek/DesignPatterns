package com.iorek.designpatterns.Factory.SimpleFactory;

import com.iorek.designpatterns.Util.Logger;

public class BMWSuperProduct implements BMWProduct {
    @Override
    public void TellName() {
        Logger.I("BMWSuperProduct");
    }
}
