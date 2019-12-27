package com.iorek.designpatterns.V2.flyweight;

import com.iorek.designpatterns.Util.Logger;

public class FlyweightImpl extends AbstractFlyweight {
    private String status;
    public FlyweightImpl(String status){
        this.status = status;
    }
    @Override
    public void flyWeightCall() {
        Logger.I("FlyweightImpl flyWeightCall");
    }
}
