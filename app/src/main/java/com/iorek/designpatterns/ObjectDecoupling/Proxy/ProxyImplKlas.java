package com.iorek.designpatterns.ObjectDecoupling.Proxy;

import com.iorek.designpatterns.Util.Logger;

public class ProxyImplKlas implements ProxyBase {
    private String TAG = ProxyImplKlas.class.getSimpleName();
    @Override
    public void BaseMethodOne() {
        Logger.I(TAG+" BaseMethodOne()");
    }

    @Override
    public void BaseMethodTwo() {
        Logger.I(TAG+" BaseMethodTwo()");
    }
}
