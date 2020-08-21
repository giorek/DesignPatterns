package com.iorek.designpatterns.v3.factory.absfactroy;

import com.iorek.designpatterns.Util.Logger;

public class Scene2 implements Scene {
    @Override
    public void doAction() {
        Logger.I("Scene2 doAction called");
    }
}
