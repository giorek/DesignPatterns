package com.iorek.designpatterns.creator.singleton;

/**
 * 单例版本一
 * 线程不安全
 */
public class SingletonV1 {
    private String TAG = SingletonV1.class.getSimpleName();
    private static SingletonV1 singletonV1;

    private SingletonV1(){}

    public static SingletonV1 getInstance(){
        if(singletonV1 == null){
            singletonV1 = new SingletonV1();
        }
        return singletonV1;
    }
}
