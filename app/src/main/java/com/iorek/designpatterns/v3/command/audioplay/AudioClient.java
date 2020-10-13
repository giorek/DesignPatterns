package com.iorek.designpatterns.v3.command.audioplay;

public class AudioClient {

    public void test(){
        AudioPlayer player = new AudioPlayer();
        AudioCommand playCommand = new PlayCommand(player);
        AudioCommand rewindCommand = new RewindCommand(player);
        AudioCommand stopCommand = new StopCommand(player);

        KeyboardInvoker invoker = new KeyboardInvoker();
        invoker.setPlayCommand(playCommand);
        invoker.setRewindCommand(rewindCommand);
        invoker.setStopCommand(stopCommand);

        invoker.play();
        invoker.rewind();
        invoker.stop();

    }
}
