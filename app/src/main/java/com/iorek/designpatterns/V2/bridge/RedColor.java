package com.iorek.designpatterns.V2.bridge;

import com.iorek.designpatterns.Util.Logger;

public class RedColor implements ColorInterface {
    @Override
    public void paint() {
        Logger.I(" RedColor paint");
    }
}
