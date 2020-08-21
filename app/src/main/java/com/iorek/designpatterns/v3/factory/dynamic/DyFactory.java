package com.iorek.designpatterns.v3.factory.dynamic;

import java.util.HashMap;
import java.util.Map;

public abstract class DyFactory {
    public static Map<String,DyFactory> mmap = new HashMap<>();

    abstract DyShape factory();

    public static void addFactory(String type,DyFactory dyShape){
        mmap.put(type,dyShape);
    }

    public static final DyShape createFactory(String type){
        for(int i = 0 ;i < mmap.size();i++){
            return mmap.get(type).factory();
        }
        return null;
    }
}
