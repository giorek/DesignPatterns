package com.iorek.designpatterns.V2.factory.simplefactory;

public class ProductOne extends Product {
    @Override
    Product selfInit() {
        return new ProductOne();
    }
}
