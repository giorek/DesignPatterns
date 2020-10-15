package com.iorek.designpatterns.v3.command.video;

import com.iorek.designpatterns.Util.Logger;

public class AudioPlayer implements IPlayer {
    @Override
    public void play() {
        Logger.I(" AudioPlayer play");
    }
}
