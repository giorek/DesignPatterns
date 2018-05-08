package com.iorek.designpatterns.Util;

import android.util.Log;

import java.io.File;

public class Logger {
    private static String TAG = "designPatterns";

    private static boolean debug = true;

    public static void I(String msg)
    {
        if(debug)
        {
            Log.i(TAG,msg);
        }
    }

    public static void I(String tag,String msg)
    {
        if(debug)
        {
            Log.i(tag, TAG+ File.pathSeparator+msg);
        }
    }
}
