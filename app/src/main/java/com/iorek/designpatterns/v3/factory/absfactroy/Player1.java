package com.iorek.designpatterns.v3.factory.absfactroy;

import com.iorek.designpatterns.Util.Logger;

public class Player1 implements Player {
    @Override
    public void interactWith(Scene scene) {
        Logger.I("Player1 interactWith called");
    }
}
