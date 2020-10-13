package com.iorek.designpatterns.v3.command.audioplay;

public class RewindCommand implements AudioCommand {
    private AudioPlayer player;

    public RewindCommand(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.rewind();
    }
}
