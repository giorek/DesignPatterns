package com.iorek.designpatterns.V2.factory.methodfactory;

import com.iorek.designpatterns.V2.factory.Product;
import com.iorek.designpatterns.V2.factory.ProductB;

public class FactoryB extends Factory {
    @Override
    Product creatProduct() {
        return new ProductB();
    }
}
