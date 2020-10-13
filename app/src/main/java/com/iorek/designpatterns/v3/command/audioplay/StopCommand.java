package com.iorek.designpatterns.v3.command.audioplay;

public class StopCommand implements AudioCommand {
    private AudioPlayer player;

    public StopCommand(AudioPlayer player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.stop();
    }
}
