package com.iorek.designpatterns.behavior.Command.v1.demo;

/**
 * 模拟客户点餐
 *
 */
public class Custom {
    public void orderFood(){
        Waiter waiter = new Waiter();
        WesternFood westernFood = new WesternFood();
        ChineseFood chineseFood = new ChineseFood();
        //waiter.orderChineseFood(chineseFood);
        //waiter.orderWesternFood(westernFood);
        waiter.orderFood(chineseFood);
        waiter.orderFood(westernFood);
        waiter.check();
    }
}
