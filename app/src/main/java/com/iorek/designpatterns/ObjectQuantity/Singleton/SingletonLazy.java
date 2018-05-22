package com.iorek.designpatterns.ObjectQuantity.Singleton;

import com.iorek.designpatterns.Util.Logger;

public final class SingletonLazy {
    private static String TAG = SingletonLazy.class.getSimpleName();
    private static SingletonLazy Instance;

    private SingletonLazy()
    {
        Logger.I(TAG+" construct time:"+System.currentTimeMillis());
    }

    public static synchronized SingletonLazy GetInstance()
    {
        Logger.I(TAG+" GetInstance time:"+System.currentTimeMillis());
        if(null == Instance)
        {
            Instance = new SingletonLazy();
        }
        return  Instance;
    }
}
