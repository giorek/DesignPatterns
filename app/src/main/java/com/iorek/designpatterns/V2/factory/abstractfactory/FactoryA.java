package com.iorek.designpatterns.V2.factory.abstractfactory;

import com.iorek.designpatterns.V2.factory.ProcductA;
import com.iorek.designpatterns.V2.factory.Product;
import com.iorek.designpatterns.V2.factory.ProductB;

public class FactoryA extends Factory {
    @Override
    Product createProductA() {
        return new ProcductA();
    }

    @Override
    Product createProductB() {
        return new ProductB();
    }
}
