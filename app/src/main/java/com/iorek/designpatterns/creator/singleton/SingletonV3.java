package com.iorek.designpatterns.creator.singleton;

/**
 * 单例模式三
 * 线程安全
 * 实例是在类加载的时候创建，所以在获取实例的时候比版本二少了一些同步操作，节省一些效率
 */
public class SingletonV3 {
    private static String TAG = SingletonV3.class.getSimpleName();
    private static SingletonV3 singletonV3 = new SingletonV3();

    private SingletonV3(){}

    public static SingletonV3 getInstance(){
        return singletonV3;
    }
}
