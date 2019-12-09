package com.iorek.designpatterns.creator.singleton;

/**
 * 单例模式二
 * 线程安全
 * 多线程创建的时候每次都会做synchronized,效率会稍微慢一些
 */
public class SingletonV2 {
    private static String TAG = SingletonV2.class.getSimpleName();
    private static SingletonV2 singletonV2;

    private SingletonV2(){};

    public static synchronized SingletonV2 getInstance(){
        if(null == singletonV2){
            singletonV2 = new SingletonV2();
        }
        return singletonV2;
    }
}
