package com.iorek.designpatterns.V2.adapter;

import android.util.Log;

import com.iorek.designpatterns.Util.Logger;

public class Adapter implements CustomExpectInterface{
    private static String TAG = Adapter.class.getSimpleName();
    private Adaptee adapteeInstance;
    public Adapter(Adaptee adaptee){
        adapteeInstance = adaptee;
    }
    @Override
    public void show() {
        Logger.I(TAG+" show ");
        if(null != adapteeInstance){
            adapteeInstance.ShowYourself();
        }
    }
}
