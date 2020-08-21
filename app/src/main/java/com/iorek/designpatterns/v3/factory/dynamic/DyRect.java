package com.iorek.designpatterns.v3.factory.dynamic;

import com.iorek.designpatterns.Util.Logger;

public class DyRect implements DyShape {
    public static class Factory extends   DyFactory{
        @Override
        public DyShape factory() {
            return new DyRect();
        }
    }

    static {
        DyFactory.addFactory("B",new Factory());
    }

    @Override
    public void draw() {
        Logger.I("draw DyRect called "+this.hashCode());
    }

    @Override
    public void erase() {
        Logger.I("erase DyRect called");
    }
}
