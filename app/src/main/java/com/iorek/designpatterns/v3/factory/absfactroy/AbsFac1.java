package com.iorek.designpatterns.v3.factory.absfactroy;

public class AbsFac1 implements AbsFactory{
    @Override
    public Player createPlayer() {
        return new Player1();
    }

    @Override
    public Scene createScene() {
        return new Scene1();
    }
}
