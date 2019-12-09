package com.iorek.designpatterns.behavior.Command.v1.demo;

/**
 * 菜单接口
 */
public interface IMenu {
    void orderChineseFood(ChineseFood chineseFood);
    void orderWesternFood(WesternFood westernFood);
    void orderFood(IFood food);
}
