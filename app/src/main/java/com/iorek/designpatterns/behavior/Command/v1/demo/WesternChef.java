package com.iorek.designpatterns.behavior.Command.v1.demo;

import com.iorek.designpatterns.Util.Logger;

public class WesternChef implements IChef {
    @Override
    public void cook() {
        Logger.I("西餐已经做好了~");
    }
}
