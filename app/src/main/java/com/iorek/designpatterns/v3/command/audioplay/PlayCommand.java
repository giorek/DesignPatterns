package com.iorek.designpatterns.v3.command.audioplay;

public class PlayCommand implements AudioCommand{
    private AudioPlayer player;

    public PlayCommand(AudioPlayer player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }
}
