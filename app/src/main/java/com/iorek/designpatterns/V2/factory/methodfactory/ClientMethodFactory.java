package com.iorek.designpatterns.V2.factory.methodfactory;

import com.iorek.designpatterns.V2.factory.Product;

/**
 *
 */
public class ClientMethodFactory {
    private Factory factory;
    private Product product;

    public void createProductA(){
        factory = new FactoryA();
        product = factory.creatProduct();
    }

    public void createProductB(){
        factory = new FactoryB();
        product = factory.creatProduct();
    }
}
