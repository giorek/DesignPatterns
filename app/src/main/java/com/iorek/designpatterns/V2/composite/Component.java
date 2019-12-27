package com.iorek.designpatterns.V2.composite;

/**
 * 组合的特点是
 * 1、有容器和单类区别
 * 2、容器和单类之间再接口上可以无区别（仅在是否实现上有区别）
 * 3、又可分为透明组合和安全组合
 *      1、透明组合指容器和单类均使用同一套方法
 *      2、安全组合在容器和单类之间所实现的接口数量是不相同的
 *      对于安全组合使用的时候需要指定具体的子类
 */
public abstract class Component {
    protected String name;
    public Component(String name){
        this.name = name;
    }
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display();
}
