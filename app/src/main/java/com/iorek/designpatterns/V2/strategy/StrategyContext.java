package com.iorek.designpatterns.V2.strategy;

public class StrategyContext implements  CalculateStrategy{
    private CalculateStrategy strategy;

    public StrategyContext(CalculateStrategy calculateStrategy){
        strategy = calculateStrategy;
    }

    @Override
    public float doOperation(float num1, float num2) {
        return strategy.doOperation(num1,num2);
    }
}
