package com.iorek.designpatterns.ObjectQuantity.Singleton;

import com.iorek.designpatterns.Util.Logger;

/**
 * @author xupeng
 * @version 1.0
 */
public final class Singleton {
    private static final String TAG = Singleton.class.getSimpleName();
    private static Singleton Instance = new Singleton();
    private Singleton() {
        Logger.I(TAG+" construct time:"+System.currentTimeMillis());
    }

    /**
     * Get Singleton Instance
     * @return Singleton instance
     */
    public static Singleton GetInstance()
    {
        Logger.I(TAG+" GetInstance time:"+System.currentTimeMillis());
        return Instance;
    }

    private String argName;
    private int argAge;

    public String getArgName() {
        return argName;
    }

    public int getArgAge() {
        return argAge;
    }

    public void setArgName(String argName) {
        this.argName = argName;
    }

    public void setArgAge(int argAge) {
        this.argAge = argAge;
    }

    @Override
    public String toString() {
        return "argName:"+this.argName+" argAge:"+this.argAge;
    }
}
