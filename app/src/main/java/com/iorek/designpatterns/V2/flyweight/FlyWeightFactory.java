package com.iorek.designpatterns.V2.flyweight;

import com.iorek.designpatterns.Util.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式
 * 1、抽象接口
 * 2、具体接口
 * 3、享元工厂
 *      用于保存实例
 *      通过参数在享元工厂中查询是否有已存在的对象
 *
 */
public class FlyWeightFactory {
    private Map<String,AbstractFlyweight> map = new HashMap<>();
    public AbstractFlyweight factory(String status){
        AbstractFlyweight instance = null;
        if(map.containsKey(status)){
            instance = map.get(status);
            Logger.I("FlyWeightFactory search from map");
        }else{
            instance = new FlyweightImpl(status);
            map.put(status,instance);
            Logger.I("FlyWeightFactory new created");
        }
        return  instance;
    }
}
