package com.iorek.designpatterns.behavior.Command.v1.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 餐厅服务生
 */
public class Waiter implements IMenu{
    private WesternFood westernFood;
    private ChineseFood chineseFood;
    private List<IFood> foodList;

    public Waiter(){
        foodList = new ArrayList<>();
    }

    /**
     * 下单接口
     */
    public void check(){
        for(int i = 0; i < foodList.size();i++){
            foodList.get(i).cook();
        }
    }

    @Override
    public void orderChineseFood(ChineseFood chineseFood) {
        this.chineseFood = chineseFood;
        foodList.add(chineseFood);
    }

    @Override
    public void orderWesternFood(WesternFood westernFood) {
        this.westernFood = westernFood;
        foodList.add(westernFood);
    }

    @Override
    public void orderFood(IFood food) {
        foodList.add(food);
    }
}
