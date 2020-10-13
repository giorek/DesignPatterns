package com.iorek.designpatterns.v3.command.audioplay;

import com.iorek.designpatterns.Util.Logger;

public class AudioPlayer {

    public void play(){
        Logger.I("play");
    }

    public void rewind(){
        Logger.I("rewind");
    }

    public void stop(){
        Logger.I("stop");
    }
}
