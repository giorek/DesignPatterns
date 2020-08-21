package com.iorek.designpatterns.v3.factory.simple;

import com.iorek.designpatterns.Util.Logger;

public class Circle extends Shape{
    @Override
    public void draw() {
        Logger.I("draw circle called");
    }

    @Override
    public void erase() {
        Logger.I("erase circle called");
    }
}
