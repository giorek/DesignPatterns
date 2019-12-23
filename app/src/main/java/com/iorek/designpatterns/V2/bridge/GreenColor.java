package com.iorek.designpatterns.V2.bridge;

import com.iorek.designpatterns.Util.Logger;

public class GreenColor implements ColorInterface {
    @Override
    public void paint() {
        Logger.I(" GreenColor paint");
    }
}
