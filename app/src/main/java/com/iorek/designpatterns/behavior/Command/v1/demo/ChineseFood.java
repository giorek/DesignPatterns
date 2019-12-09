package com.iorek.designpatterns.behavior.Command.v1.demo;

import com.iorek.designpatterns.Util.Logger;

public class ChineseFood implements IFood {
    private IChef chineseChef;

    public ChineseFood(){
        chineseChef = new ChineseChef();
    }
    @Override
    public void cook() {
        Logger.I("我要做中餐");
        chineseChef.cook();
    }
}
