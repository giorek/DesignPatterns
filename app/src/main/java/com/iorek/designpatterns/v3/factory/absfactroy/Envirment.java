package com.iorek.designpatterns.v3.factory.absfactroy;

public class Envirment {
    private Player mPlayer;
    private Scene scene;
    private AbsFactory factory;
    public Envirment(AbsFactory factory){
        this.factory = factory;
        createEnv();
    }

    public void createEnv(){
        mPlayer = factory.createPlayer();
        scene = factory.createScene();
    }

    public void play(){
        mPlayer.interactWith(scene);
    }
}
