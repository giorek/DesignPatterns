package com.iorek.designpatterns.V2.singleton;

/**
 * 1、只有一个实例会被初创建
 * 2、扩充的时候需要进行当前类的修改
 * 3、
 *
 */
public class SingletonA {
    private static SingletonA instance = new SingletonA();
    private SingletonA(){}

    public SingletonA getInstance(){
        return instance;
    }

    public void methodOne(){

    }

    public void methodTwo(){

    }
}
