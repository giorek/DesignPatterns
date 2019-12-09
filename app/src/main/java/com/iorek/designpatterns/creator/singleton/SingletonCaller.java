package com.iorek.designpatterns.creator.singleton;

/**
 * 单例模式调用
 * 使用四种模式进行单例的实例化
 * 其中v3 v4具有线程安全性，且不会再每次获取时进行资源同步
 *
 * step1
 *      私有化构造方法
 *      对外提供静态的获取方法
 */
public class SingletonCaller {
    public void getInstance(){
        SingletonV1 v1 = SingletonV1.getInstance();
        SingletonV2 v2 = SingletonV2.getInstance();
        SingletonV3 v3 = SingletonV3.getInstance();
        SingletonV4 v4 = SingletonV4.getInstance();
    }
}
