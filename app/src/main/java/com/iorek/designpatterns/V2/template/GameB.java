package com.iorek.designpatterns.V2.template;

import com.iorek.designpatterns.Util.Logger;

public class GameB extends GameTemplate {
    private static final String TAG = GameB.class.getSimpleName();
    @Override
    protected void runGame() {
        Logger.I(String.format("%s runGame",TAG));
    }

    @Override
    protected void choosePerson() {
        super.choosePerson();
        Logger.I(String.format("%s choosePerson",TAG));
    }

    @Override
    protected void startGame() {
        Logger.I(String.format("%s startGame",TAG));
    }

    @Override
    protected void endGame() {
        Logger.I(String.format("%s endGame",TAG));
    }
}
