package com.iorek.designpatterns.V2.factory;

import com.iorek.designpatterns.Util.Logger;

public class ProcductA extends Product {
    private static String TAG = ProcductA.class.getSimpleName();
    public ProcductA()
    {
        Logger.I(TAG,"product A is created....");
    }
}
