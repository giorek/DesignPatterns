package com.iorek.designpatterns.V2.factory.simplefactory;

public class ProductTwo extends Product {
    @Override
    Product selfInit() {
        return new ProductTwo();
    }
}
