package com.iorek.designpatterns.V2.bridge;

public class PenA extends AbstractPen {
    @Override
    public void draw() {
        mColor.paint();
    }
}
