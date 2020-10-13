package com.iorek.designpatterns.v3.state;

import com.iorek.designpatterns.Util.Logger;

public class OpenState extends BaseState {
    @Override
    public void open() {
        super.context.open();
        Logger.I(" OpenState open");
    }

    @Override
    public void close() {
        Logger.I(" OpenState close");
    }

    @Override
    public void run() {
        Logger.I(" OpenState run");
    }

    @Override
    public void stop() {
        Logger.I(" OpenState stop");
    }
}
