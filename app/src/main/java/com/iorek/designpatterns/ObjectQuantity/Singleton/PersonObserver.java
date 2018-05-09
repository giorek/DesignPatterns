package com.iorek.designpatterns.ObjectQuantity.Singleton;

import com.iorek.designpatterns.Util.Logger;

public class PersonObserver implements ObserverInterface {
    @Override
    public void TellYourName() {
        Logger.I("My name is PersonObserver");
    }
}
