package com.iorek.designpatterns.creator.singleton;

/**
 * 单例版本4
 * 实例的创建依赖于内部类进行构造
 */
public class SingletonV4 {
    private static String TAG = SingletonV4.class.getSimpleName();

    private SingletonV4(){};

    private static class SingletonInner{
        private static SingletonV4 singletonV4 = new SingletonV4();
    }

    public static SingletonV4 getInstance(){
        return SingletonInner.singletonV4;
    }
}
