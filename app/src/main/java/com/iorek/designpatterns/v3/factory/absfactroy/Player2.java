package com.iorek.designpatterns.v3.factory.absfactroy;

import com.iorek.designpatterns.Util.Logger;

public class Player2 implements Player {
    @Override
    public void interactWith(Scene scene) {
        Logger.I("Player2 interactWith called");
    }
}
