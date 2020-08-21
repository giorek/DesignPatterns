package com.iorek.designpatterns.v3.factory.absfactroy;

public class AbsFac2 implements AbsFactory {
    @Override
    public Player createPlayer() {
        return new Player2();
    }

    @Override
    public Scene createScene() {
        return new Scene2();
    }
}
