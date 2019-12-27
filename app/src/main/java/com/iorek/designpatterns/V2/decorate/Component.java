package com.iorek.designpatterns.V2.decorate;

/**
 * 装饰器模式
 * 1、定义基本的抽象接口
 * 2、抽象接口具有实现的子类
 * 3、构建一个装饰器，装饰器实现抽象接口，在构造中需要持有抽象接口实现类的引用
 * 4、装饰器可以持有不同的子类，子类在抽象接口的基础上增加不同的细节方法
 */
public interface Component {
    void componentMethod();
}
