package com.iorek.designpatterns.behavior.Command.v1.demo;

import com.iorek.designpatterns.Util.Logger;

public class WesternFood implements IFood {
    private IChef westernChef;

    public WesternFood(){
        westernChef = new WesternChef();
    }
    @Override
    public void cook() {
        Logger.I("我要做西餐");
        westernChef.cook();
    }
}
