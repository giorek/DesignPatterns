package com.iorek.designpatterns.V2.factory.abstractfactory;

import com.iorek.designpatterns.V2.factory.Product;

/**
 * 每个工厂可以生产多个产品
 * 所谓抽象是只对多工厂的抽象
 */
public abstract class Factory {
    abstract Product createProductA();
    abstract Product createProductB();
}
