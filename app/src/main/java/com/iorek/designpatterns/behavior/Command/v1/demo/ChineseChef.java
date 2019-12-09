package com.iorek.designpatterns.behavior.Command.v1.demo;

import com.iorek.designpatterns.Util.Logger;

/**
 * 中餐厨师
 */
public class ChineseChef implements IChef {
    @Override
    public void cook() {
        Logger.I("中餐已经做好了~");
    }
}
