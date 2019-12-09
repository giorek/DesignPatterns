package com.iorek.designpatterns.V2.factory;

import com.iorek.designpatterns.Util.Logger;

public class ProductB extends Product {
    private static String TAG = ProcductA.class.getSimpleName();
    public ProductB()
    {
        Logger.I(TAG,"product B is created....");
    }
}
