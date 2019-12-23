package com.iorek.designpatterns.V2.bridge;

public class PenB extends AbstractPen {
    @Override
    public void draw() {
        mColor.paint();
    }
}
