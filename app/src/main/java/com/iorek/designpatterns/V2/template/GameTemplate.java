package com.iorek.designpatterns.V2.template;

public abstract class GameTemplate {
    protected abstract void runGame();
    protected void choosePerson(){}
    protected abstract void startGame();
    protected abstract void endGame();

    public void palyGame(){
        runGame();
        choosePerson();
        startGame();
        endGame();
    }
}
