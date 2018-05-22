package com.iorek.designpatterns.ObjectQuantity.Singleton;

import com.iorek.designpatterns.Util.Logger;

public class GodObserver implements ObserverInterface {
    @Override
    public void TellYourName() {
        Logger.I("My name is GodObserver");
    }
}
