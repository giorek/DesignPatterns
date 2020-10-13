package com.iorek.designpatterns.v3.command.audioplay;

public class KeyboardInvoker implements PlayerAction{
    private AudioCommand playCommand;
    private AudioCommand rewindCommand;
    private AudioCommand stopCommand;

    public void setPlayCommand(AudioCommand playCommand) {
        this.playCommand = playCommand;
    }

    public void setRewindCommand(AudioCommand rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

    public void setStopCommand(AudioCommand stopCommand) {
        this.stopCommand = stopCommand;
    }

    @Override
    public void play() {
        playCommand.execute();
    }

    @Override
    public void rewind() {
        rewindCommand.execute();
    }

    @Override
    public void stop() {
        stopCommand.execute();
    }
}
