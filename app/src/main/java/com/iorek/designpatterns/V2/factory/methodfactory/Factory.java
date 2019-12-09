package com.iorek.designpatterns.V2.factory.methodfactory;

import com.iorek.designpatterns.V2.factory.Product;

/**
 * 工厂方法，每个工厂只生产单一的产品
 */
public abstract class Factory {
    abstract Product creatProduct();
}
