package com.iorek.designpatterns.V2.factory.methodfactory;

import com.iorek.designpatterns.V2.factory.ProcductA;
import com.iorek.designpatterns.V2.factory.Product;

public class FactoryA extends Factory {
    @Override
    Product creatProduct() {
        return new ProcductA();
    }
}
