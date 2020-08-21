package com.iorek.designpatterns.v3.factory.absfactroy;

import com.iorek.designpatterns.Util.Logger;

public class Scene1 implements Scene {
    @Override
    public void doAction() {
        Logger.I("Scene1 doAction called");
    }
}
