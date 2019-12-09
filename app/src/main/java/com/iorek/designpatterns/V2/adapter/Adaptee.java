package com.iorek.designpatterns.V2.adapter;

import com.iorek.designpatterns.Util.Logger;

/**
 * 已经存在的类
 */
public class Adaptee {
    private static String TAG = Adaptee.class.getSimpleName();
    public void ShowYourself(){
        Logger.I(TAG+" ShowYourself run");
    }
}
