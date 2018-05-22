package com.iorek.designpatterns.ObjectDecoupling.Proxy;

/**
 * @author xupeng
 * @version 1.0
 * 代理类
 * 1、代理类中持有一个实现类
 * 2、代理类构造的时候传递进入一个实现类
 * 3、代理类和实现类继承自相同的接口
 * 4、调用代理类的接口实际上调用的是实现类的接口
 */
public class ProxyKlas implements ProxyBase {
    private ProxyBase proxyBaseImpl;
    public ProxyKlas(ProxyBase proxyBaseImpl)
    {
        this.proxyBaseImpl = proxyBaseImpl;
    }

    @Override
    public void BaseMethodOne() {
        proxyBaseImpl.BaseMethodOne();
    }

    @Override
    public void BaseMethodTwo() {
        proxyBaseImpl.BaseMethodTwo();
    }
}
