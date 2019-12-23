package com.iorek.designpatterns.V2.bridge;

public abstract class AbstractPen {
    protected ColorInterface mColor;
    public void setmColor(ColorInterface color){
        mColor = color;
    }

    public abstract void draw();
}
