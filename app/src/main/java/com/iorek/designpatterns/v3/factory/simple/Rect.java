package com.iorek.designpatterns.v3.factory.simple;

import com.iorek.designpatterns.Util.Logger;

public class Rect extends Shape {
    @Override
    public void draw() {
        Logger.I("draw rect called");
    }

    @Override
    public void erase() {
        Logger.I("draw rect called");
    }
}
