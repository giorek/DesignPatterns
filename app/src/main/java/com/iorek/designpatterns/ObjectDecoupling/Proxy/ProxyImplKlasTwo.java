package com.iorek.designpatterns.ObjectDecoupling.Proxy;

import com.iorek.designpatterns.Util.Logger;

public class ProxyImplKlasTwo implements ProxyBase {
    private String TAG = ProxyImplKlasTwo.class.getSimpleName();
    @Override
    public void BaseMethodOne() {
        Logger.I(TAG+" BaseMethodOne()");
    }

    @Override
    public void BaseMethodTwo() {
        Logger.I(TAG+" BaseMethodTwo()");
    }
}
