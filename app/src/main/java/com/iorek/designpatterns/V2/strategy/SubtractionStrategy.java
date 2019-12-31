package com.iorek.designpatterns.V2.strategy;

public class SubtractionStrategy implements CalculateStrategy {
    @Override
    public float doOperation(float num1, float num2) {
        return num1 - num2;
    }
}
