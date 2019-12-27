package com.iorek.designpatterns.V2.bridge;

/**
 * 抽象类
 * 1、抽象类中包含接口实现类的实例（抽象类或者接口）
 * 2、此抽象类又具有两个实现子类
 */
public abstract class AbstractPen {
    protected ColorInterface mColor;
    public void setmColor(ColorInterface color){
        mColor = color;
    }

    public abstract void draw();
}
