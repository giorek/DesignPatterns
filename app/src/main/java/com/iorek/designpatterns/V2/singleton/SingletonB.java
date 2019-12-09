package com.iorek.designpatterns.V2.singleton;

/**
 * 此种方式的创建时每次都需要判断当前对象是否存在和进行锁操作
 * 与方案A相比多了一些校验判断
 */
public class SingletonB {
    private static SingletonB instance;
    private static Object object = new Object();

    private SingletonB(){}

    public static SingletonB getInstance(){
        synchronized (object){
            if(instance == null)
            {
                instance = new SingletonB();
            }
            return instance;
        }
    }

    public void methodOne(){}

    public void methodTwo(){}
}
